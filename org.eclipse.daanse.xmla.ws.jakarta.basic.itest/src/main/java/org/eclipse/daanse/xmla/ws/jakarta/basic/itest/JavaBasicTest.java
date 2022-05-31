package org.eclipse.daanse.xmla.ws.jakarta.basic.itest;

import static org.eclipse.daanse.xmla.ws.jakarta.basic.itest.SOAPUtil.callSoapWebService;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Hashtable;
import java.util.function.Consumer;

import org.eclipse.daanse.xmla.model.jaxb.xmla.DiscoverResponse;
import org.eclipse.daanse.xmla.model.jaxb.xmla.DiscoverResponse.Return;
import org.eclipse.daanse.xmla.model.jaxb.xmla_rowset.Row;
import org.eclipse.daanse.xmla.model.jaxb.xmla_rowset.Rowset;
import org.eclipse.daanse.xmla.ws.jakarta.basic.XmlaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.osgi.annotation.bundle.Capability;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.soap.SOAPPart;

@Capability(namespace = "osgi.service", attribute = "objectClass:List<String>=org.eclipse.daanse.xmla.ws.jakarta.basic.XmlaService")
public class JavaBasicTest {
	private Logger logger = LoggerFactory.getLogger(JavaBasicTest.class);

	public static String soapEndpointUrl = "http://localhost:8081/xmla";
	public static String SOAP_ACTION_DISCOVER = "urn:schemas-microsoft-com:xml-analysis:Discover";

	@InjectBundleContext
	BundleContext bc;

	XmlaService xmlaService;

	@BeforeEach
	void beforaEach() {
		xmlaService = Mockito.mock(XmlaService.class);
		bc.registerService(XmlaService.class, xmlaService, new Hashtable<>());
	}

	@Test
	void testName() throws Exception {

		DiscoverResponse discoverResponse = new DiscoverResponse();
		Return r = new Return();
		Rowset rs = new Rowset();
		Row row = new Row();
		rs.getRow().add(row);
		r.setRoot(rs);
		discoverResponse.setReturn(r);

		when(xmlaService.discover(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any()))
				.thenReturn(discoverResponse);

		SOAPMessage response = callSoapWebService(soapEndpointUrl, SOAP_ACTION_DISCOVER, createSoapMessage());

		verify(xmlaService, (times(1))).discover(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any());

		// TODO: Check Response

	}

	private static Consumer<SOAPMessage> createSoapMessage() throws SOAPException {

		return plainSoapMessage -> {

			try {
				SOAPPart soapPart = plainSoapMessage.getSOAPPart();
				plainSoapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");
				String myNamespace = "";
				String myNamespaceURI = "urn:schemas-microsoft-com:xml-analysis";

				// SOAP Envelope
				SOAPEnvelope envelope = soapPart.getEnvelope();
				envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

				// SOAP Body
				SOAPBody soapBody = envelope.getBody();
				SOAPElement soapBodyDiscover = soapBody.addChildElement("Discover", myNamespace);
				SOAPElement soapBodyRequestType = soapBodyDiscover.addChildElement("RequestType", myNamespace);
				soapBodyRequestType.addTextNode("theRequestType");
				SOAPElement soapBodyRequestRestrictions = soapBodyDiscover.addChildElement("Restrictions", myNamespace);
				SOAPElement soapBodyRequestRestrictionList = soapBodyRequestRestrictions
						.addChildElement("RestrictionList", myNamespace);
				SOAPElement soapBodyProperties = soapBodyDiscover.addChildElement("Properties", myNamespace);
				SOAPElement soapBodyPropertyList = soapBodyProperties.addChildElement("PropertyList", myNamespace);
				SOAPElement soapBodyDataSourceInfo = soapBodyPropertyList.addChildElement("DataSourceInfo",
						myNamespace);
				soapBodyDataSourceInfo.addTextNode("theDataSourceInfo");
				SOAPElement soapBodyCatalog = soapBodyPropertyList.addChildElement("Catalog", myNamespace);
				soapBodyCatalog.addTextNode("theCatalog");
				SOAPElement soapBodyFormat = soapBodyPropertyList.addChildElement("Format", myNamespace);
				soapBodyFormat.addTextNode("theFormat");
				SOAPElement soapBodyContent = soapBodyPropertyList.addChildElement("Content", myNamespace);
				soapBodyContent.addTextNode("theContent");
			} catch (SOAPException e) {
				fail(e);
			}
		};
	}

}
