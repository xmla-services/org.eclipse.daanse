package org.eclipse.daanse.xmla.ws.jakarta.emf.internal;

import org.eclipse.daanse.xmla.model.ecore.xmla.Discover;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponse;
import org.eclipse.daanse.xmla.ws.jakarta.emf.XmlaService;

import com.sun.xml.ws.server.DraconianValidationErrorHandler;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.soap.SOAPBinding;



public class MsXmlAnalysisSoap {
	DraconianValidationErrorHandler c = new DraconianValidationErrorHandler();
	private XmlaService xmlaService;

	public MsXmlAnalysisSoap(XmlaService xmlaService) {
		this.xmlaService = xmlaService;
	}

	@WebMethod(operationName = "Discover", action = "urn:schemas-microsoft-com:xml-analysis:Discover")
	@WebResult(name = "DiscoverResponse", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", partName = "parameters")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)

	public DiscoverResponse discover(
			@WebParam(name = "Discover", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", partName = "parameters") Discover parameters) {

		System.out.println("---");

		System.out.println(parameters.getRequestType());
		System.out.println(parameters.getRequestType());
		System.out.println(parameters.getRequestType());
		System.out.println(parameters.getRequestType());
		System.out.println(parameters.getRequestType());
		DiscoverResponse discoverResponse = xmlaService.discover(parameters);
		return discoverResponse;
	}

}
