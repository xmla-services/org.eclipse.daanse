package org.eclipse.daanse.xmla.ws.jakarta.basic.internal;

import java.util.List;

import org.eclipse.daanse.xmla.ws.jakarta.basic.XmlaService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.handler.Handler;

@Component(immediate = true)
public class Server {

	private Endpoint endpoint;

	@Reference
	XmlaService xmlaService;

	@Activate
	public void activate() {
		int port = 8081;
		String address = "http://localhost:" + port + "/xmla";
		endpoint = Endpoint.create(new MsXmlAnalysisSoap(xmlaService));
		List<Handler> handlerChain = endpoint.getBinding().getHandlerChain();
		handlerChain.add(new SOAPLoggingHandler());
		endpoint.getBinding().setHandlerChain(handlerChain);
		endpoint.publish(address);

		
		// TODO: may register with as a servlet
	}

	@Deactivate
	public void deactivate() {
		endpoint.stop();
		endpoint = null;
	}
}