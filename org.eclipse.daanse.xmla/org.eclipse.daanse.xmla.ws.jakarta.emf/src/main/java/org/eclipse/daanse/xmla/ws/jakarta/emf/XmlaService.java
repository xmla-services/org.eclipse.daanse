package org.eclipse.daanse.xmla.ws.jakarta.emf;

import org.eclipse.daanse.xmla.model.ecore.xmla.Discover;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponse;

public interface XmlaService {

  public DiscoverResponse discover(Discover parameters);

}
