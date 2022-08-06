package org.eclipse.daanse.core.impl;

import java.util.Map;

import javax.sql.DataSource;

import org.eclipse.daanse.core.api.Context;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.util.converter.Converters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Context.class)
@Designate(factory = true, ocd = ContextConfig.class)
public class DefaultContext implements Context {

	private Logger LOGGER = LoggerFactory.getLogger(DefaultContext.class);
	private ContextConfig config;
	private DataSource dataSource;

	@Activate
	public void activate(Map<String, Object> configMap) {
		this.config = toConfig(configMap);

	}

	private ContextConfig toConfig(Map<String, Object> configMap) {
		return Converters.standardConverter().convert(configMap).to(ContextConfig.class);
	}

	@Modified
	public void midified(Map<String, Object> configMap) {
		this.config = toConfig(configMap);

	}

	@Deactivate
	public void deActivate(Map<String, Object> configMap) {
		config = null;
	}

	@Reference(cardinality = ReferenceCardinality.MANDATORY, policy = ReferencePolicy.DYNAMIC, name = "org.eclipse.daanse.context.default.datasource", target = "(&(must.not.resolve=*)(!(must.not.resolve=*)))")
	public void bindDataSource(DataSource dataSource) {
		this.dataSource = dataSource;

	}

	public void updatedDataSource(DataSource dataSource) {
		this.dataSource = dataSource;

	}

	public void unbindDataSource(DataSource dataSource) {
		this.dataSource = dataSource;

	}

}
