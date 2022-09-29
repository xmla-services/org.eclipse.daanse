package org.eclipse.daanse.webres.core;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardContextSelect;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardResource;

@HttpWhiteboardResource(pattern = { "/*" }, prefix = "/")
@HttpWhiteboardContextSelect("(" + HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "="
		+ WebResServletContextHelper.NAME + ")")
@Component(service = WebResService.class)
public class WebResService {

}
