package org.eclipse.daanse.xmla.ws.jakarta.basic;

import org.eclipse.daanse.xmla.model.jaxb.ext.ReturnValue;
import org.eclipse.daanse.xmla.model.jaxb.xmla.BeginSession;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Discover;
import org.eclipse.daanse.xmla.model.jaxb.xmla.DiscoverResponse;
import org.eclipse.daanse.xmla.model.jaxb.xmla.EndSession;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Execute;
import org.eclipse.daanse.xmla.model.jaxb.xmla.ExecuteResponse;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Session;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.BindingType;
import jakarta.xml.ws.Holder;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

//wsdlLocation = "file:/home/stbischof/dev/git/org.eclipse.daanse.xmla/org.eclipse.daanse.xmla.definition/xmla.wsdl", 
@WebService(name = "MsXmlAnalysisSoapPortType", portName = "MsXmlAnalysisSoapPort", serviceName = "MsXmlAnalysisService", targetNamespace = "urn:daanse-eclipse-org:xmla-ws")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
@XmlSeeAlso({ org.eclipse.daanse.xmla.model.jaxb.msxmla.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.ext.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.xmla.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine300_300.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.xmla_exception.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.xmla_mddataset.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine100.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine2.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine200.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine300.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine400.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine600.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine800.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.xmla_empty.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.xmla_multipleresults.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.xmla_rowset.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine100_100.ObjectFactory.class,
		org.eclipse.daanse.xmla.model.jaxb.engine200_200.ObjectFactory.class

})
public class MsXmlAnalysisSoap {

	public MsXmlAnalysisSoap() {
	}

	@WebMethod(operationName = "Authenticate")
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "Authenticate", targetNamespace = "http://schemas.microsoft.com/analysisservices/2003/ext", className = "org.eclipse.daanse.xmla.model.jaxb.xmla.ext.Authenticate")
	@ResponseWrapper(localName = "AuthenticateResponse", targetNamespace = "http://schemas.microsoft.com/analysisservices/2003/ext", className = "org.eclipse.daanse.xmla.model.jaxb.xmla.ext.AuthenticateResponse")
	public ReturnValue authenticate(@WebParam(name = "SspiHandshake", targetNamespace = "") byte[] sspiHandshake) {

		ReturnValue rv = new ReturnValue();
		rv.setSspiHandshake(sspiHandshake);
		return rv;
	}

	@WebMethod(operationName = "Discover", action = "urn:schemas-microsoft-com:xml-analysis:Discover")
	@WebResult(name = "DiscoverResponse", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", partName = "parameters")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public DiscoverResponse discover(
			@WebParam(name = "Discover", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", partName = "parameters") Discover parameters,
			@WebParam(name = "Session", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", header = true, mode = WebParam.Mode.INOUT, partName = "Session") Holder<Session> session,
			@WebParam(name = "BeginSession", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", header = true, partName = "BeginSession") BeginSession beginSession,
			@WebParam(name = "EndSession", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", header = true, partName = "EndSession") EndSession endSession) {
		return null;
	}

	@WebMethod(operationName = "Execute", action = "urn:schemas-microsoft-com:xml-analysis:Execute")
	@WebResult(name = "ExecuteResponse", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", partName = "parameters")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public ExecuteResponse execute(
			@WebParam(name = "Execute", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", partName = "parameters") Execute parameters,
			@WebParam(name = "Session", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", header = true, mode = WebParam.Mode.INOUT, partName = "Session") Holder<Session> session,
			@WebParam(name = "BeginSession", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", header = true, partName = "BeginSession") BeginSession beginSession,
			@WebParam(name = "EndSession", targetNamespace = "urn:schemas-microsoft-com:xml-analysis", header = true, partName = "EndSession") EndSession endSession) {
		return null;
	}

}
