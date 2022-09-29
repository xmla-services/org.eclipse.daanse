package org.eclipse.daanse.mdx.xtext.web;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.context.ServletContextHelper;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardContext;

//@Component(service = ServletContextHelper.class, scope = ServiceScope.BUNDLE)
@HttpWhiteboardContext(name = BundleDelegatingServletContext.NAME, path = "/xtext")
public class BundleDelegatingServletContext extends ServletContextHelper {

	public static final String NAME = "xtext";

	@Activate
	public BundleDelegatingServletContext(final ComponentContext ctx) {
		super(ctx.getUsingBundle());
	}

}