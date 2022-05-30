package org.eclipse.daanse.xmla.ws.jakarta.basic;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import jakarta.xml.ws.Endpoint;

@Component(immediate = true)
public class Server {

	private Endpoint endpoint;

	@Activate
	public void activate() {
		int port = 8081;
		String address = "http://localhost:" + port + "/xmla";
		endpoint = Endpoint.create(new MsXmlAnalysisSoap());
		endpoint.publish(address);
	}

	@Deactivate
	public void deactivate() {
		endpoint.stop();
		endpoint=null;
	}
}
