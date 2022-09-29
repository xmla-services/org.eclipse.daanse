package org.eclipse.daanse.webres.core;

import java.net.URL;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.context.ServletContextHelper;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardContext;
import org.osgi.util.tracker.BundleTracker;
import org.osgi.util.tracker.BundleTrackerCustomizer;

import aQute.bnd.header.OSGiHeader;
import aQute.bnd.header.Parameters;

@Component(service = ServletContextHelper.class, scope = ServiceScope.SINGLETON)
@HttpWhiteboardContext(name = WebResServletContextHelper.NAME, path = "/webresource")
public class WebResServletContextHelper extends ServletContextHelper implements BundleTrackerCustomizer<Object> {
	private BundleTracker<?> bundleTracker = null;
	private Map<Bundle, List<WebResource>> store = new HashMap<>();

	@Activate
	public void activate(BundleContext ctx) {
		bundleTracker = new BundleTracker<>(ctx, Bundle.INSTALLED | Bundle.RESOLVED | Bundle.STARTING | Bundle.ACTIVE,
				this);
		bundleTracker.open();
	}

	@Deactivate
	public void deactivate(BundleContext ctx) {

		bundleTracker.close();
	}

	public static final String NAME = "WebResCtx";

	@Override
	public URL getResource(String name) {
		final String clearedName = clear(name);

		Optional<SimpleEntry<Bundle, WebResource>> o = store.entrySet().parallelStream().map(e -> {

			WebResource res = e.getValue().parallelStream().filter(wr -> {
				String s = wr.name() + "-" + wr.version();
				return clearedName.startsWith(s + "/");
			}).findAny().orElse(null);
			if (res == null) {
				return null;
			}
			return new AbstractMap.SimpleEntry<>(e.getKey(), res);
		}).filter(Objects::nonNull).findAny();

		System.out.println(o);
		return o.map(e -> {
			WebResource wr = e.getValue();
			String s = wr.name() + "-" + wr.version();
			String ss = clearedName.replace(s, wr.basePath()  + wr.path());
			return e.getKey().getResource(ss);
		}).orElse(null);
//		return super.getResource(name);
	}

	private String clear(String name) {
		if (name != null && name.startsWith("/")) {
			return clear(name.substring(1));
		}
		return name;
	}

	@Override
	public Set<String> getResourcePaths(String path) {
		return super.getResourcePaths(path);
	}

	@Override
	public String getRealPath(String path) {
		return super.getRealPath(path);
	}

	@Override
	public Object addingBundle(Bundle bundle, BundleEvent event) {
		if (bundle.getHeaders().get(WebResConstants.PROVIDE_CAPABILITY) != null) {
			List<WebResource> webResources = readWebResourceCapabilityMetadata(bundle);
			if (!webResources.isEmpty()) {
				store.put(bundle, webResources);
			}
		}
		return null;
	}

	private List<WebResource> readWebResourceCapabilityMetadata(Bundle bundle) {
		List<WebResource> list = new ArrayList<>();
		String capabilityHeader = bundle.getHeaders().get(WebResConstants.PROVIDE_CAPABILITY);

		if (!matches(capabilityHeader, WebResConstants.NS)) {

			return list;
		}

		Parameters capabilities = OSGiHeader.parseHeader(capabilityHeader);
		for (Entry<String, ? extends Map<String, String>> webResCapability : findAllMetadata(capabilities,
				WebResConstants.NS)) {
			System.out.println(webResCapability);
			String webres_path = null;
			String webres_name = null;
			String version = null;
			Map<String, String> paths = new HashMap<>();
			for (Entry<String, String> entry : webResCapability.getValue().entrySet()) {
				if ("webres.path".equals(entry.getKey())) {
					webres_path = entry.getValue().toString();
					continue;
				} else if ("version:".equals(entry.getKey())) {
					version = entry.getValue().toString();
					continue;
				} else if ("webres.name".equals(entry.getKey())) {
					webres_name = entry.getValue().toString();
					continue;
				} else if (entry.getKey().startsWith("path")) {
					String key = entry.getKey().toString().substring(4);

					if (key.startsWith(".")) {
						key = key.substring(1);
					}
					String value = entry.getValue().toString();
					paths.put(key, value);

					continue;
				}

			}
			for (Entry<String, String> entry : paths.entrySet()) {
				String key=entry.getKey();
				String value=entry.getValue();
				String connector = key.isBlank() ? "" : "-";
				list.add(new WebResource(webres_name + connector + key, version, webres_path, value));
			}
		}

		return list;
	}

	private static boolean matches(String val, String matchString) {
		if (val == null)
			return false;

		if (matchString == null)
			return true;

		int idx = val.indexOf(matchString);
		return idx >= 0;
	}

	private static Collection<Entry<String, ? extends Map<String, String>>> findAllMetadata(
			Parameters requirementsOrCapabilities, String namespace) {
		List<Entry<String, ? extends Map<String, String>>> reqsCaps = new ArrayList<>();
		for (Entry<String, ? extends Map<String, String>> reqCap : requirementsOrCapabilities.entrySet()) {
			String key = removeDuplicateMarker(reqCap.getKey());
			if (namespace.equals(key)) {
				reqsCaps.add(reqCap);
			}
		}
		return reqsCaps;
	}

	static String removeDuplicateMarker(String key) {
		int i = key.length() - 1;
		while (i >= 0 && key.charAt(i) == '~')
			--i;

		return key.substring(0, i + 1);
	}

	@Override
	public void modifiedBundle(Bundle bundle, BundleEvent event, Object object) {

	}

	@Override
	public void removedBundle(Bundle bundle, BundleEvent event, Object object) {
		store.remove(bundle);
	}

}
