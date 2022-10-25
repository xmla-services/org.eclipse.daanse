package org.eclipse.daanse.core.impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Icon;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(description = "%ocd.description", name = "%ocd.name", icon = @Icon(resource = "icon/context-32.png", size = 32))
public interface ContextConfig {

  @AttributeDefinition(description = "%service.name.description", name = "%service.name.name")
  public default String service_name() {
    return null;
  }

  @AttributeDefinition(description = "%service.description.description", name = "%service.description.name")
  public default String service_description() {
    return null;
  }

  @AttributeDefinition(description = "%service.ranking.description", name = "%service.ranking.name")
  public default String service_ranking() {
    return null;
  }

  @AttributeDefinition(description = "%target.datasource.description", name = "%target.datasource.name", required = true, defaultValue = "&((service.pid=not.set)(service.pid=set.filter))")
  public default String target_datasource() {
    return null;
  }

}
