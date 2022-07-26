package org.eclipse.daanse.xmla.ws.jakarta.basic.itest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.eclipse.daanse.xmla.ws.jakarta.basic.itest.SOAPUtil.callSoapWebService;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Hashtable;
import java.util.function.Consumer;

import javax.xml.namespace.QName;

import org.eclipse.daanse.xmla.model.jaxb.xmla.Discover;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Discover.Restrictions;
import org.eclipse.daanse.xmla.model.jaxb.xmla.DiscoverResponse;
import org.eclipse.daanse.xmla.model.jaxb.xmla.DiscoverResponse.Return;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Properties;
import org.eclipse.daanse.xmla.model.jaxb.xmla_rowset.Row;
import org.eclipse.daanse.xmla.model.jaxb.xmla_rowset.Rowset;
import org.eclipse.daanse.xmla.ws.jakarta.basic.XmlaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aQute.bnd.annotation.service.ServiceCapability;
import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.soap.SOAPPart;

@ServiceCapability(XmlaService.class)
public class JavaBasicTest {
	private Logger logger = LoggerFactory.getLogger(JavaBasicTest.class);

	private static final String URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS = "urn:schemas-microsoft-com:xml-analysis";

	public static final QName QNAME_Discover = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS, "Discover");
	public static final QName QNAME_RequestType = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS, "RequestType");
	public static final QName QNAME_Restrictions = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS, "Restrictions");
	public static final QName QNAME_RestrictionList = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS,
			"RestrictionList");
	public static final QName QNAME_Properties = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS, "Properties");
	public static final QName QNAME_PropertyList = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS, "PropertyList");
	public static final QName QNAME_DataSourceInfo = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS, "DataSourceInfo");
	public static final QName QNAME_Catalog = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS, "Catalog");
	public static final QName QNAME_Format = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS, "Format");
	public static final QName QNAME_Content = new QName(URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS, "Content");

	public static final String soapEndpointUrl = "http://localhost:8081/xmla";
	public static final String SOAP_ACTION_DISCOVER = URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS + ":Discover";

	public static final String REQUEST_DISCOVER_MDSCHEMACUBES_CONTENT = """
			<urn:Discover xmlns:urn="urn:schemas-microsoft-com:xml-analysis">
			<RequestType>MDSCHEMA_CUBES</RequestType>
			<Restrictions></Restrictions>
			<Properties>
			<PropertyList>
			<Content>Data</Content>
			</PropertyList>
			</Properties>
			</urn:Discover>
			""";

	@InjectBundleContext
	BundleContext bc;

	private ArgumentCaptor<Discover> dicoverCaptor;

	@BeforeEach
	void beforaEach() {
		XmlaService xmlaService = mock(XmlaService.class);
		dicoverCaptor = ArgumentCaptor.forClass(Discover.class);
		bc.registerService(XmlaService.class, xmlaService, new Hashtable<>());
	}

	@Test
	void testRequestwsdl(@InjectService XmlaService xmlaService) throws Exception {

		System.out.println(1);
	}

	@Test
	void testRequest_MDSCHEMA_CUBES_Content_Data(@InjectService XmlaService xmlaService) throws Exception {

		callSoapWebService(soapEndpointUrl, SOAP_ACTION_DISCOVER, envelop(REQUEST_DISCOVER_MDSCHEMACUBES_CONTENT));

		verify(xmlaService, (times(1))).discover(dicoverCaptor.capture(), isNull(), isNull(), isNull());

		var discoverAssert = assertThat(dicoverCaptor.getValue());

		discoverAssert.extracting(Discover::getRequestType).isNotNull().isEqualTo("MDSCHEMA_CUBES");

		discoverAssert.extracting(Discover::getRestrictions)
				.isNotNull()
				.extracting(Restrictions::getRestrictionList)
				.isNull();

		discoverAssert.extracting(Discover::getProperties)
				.isNotNull()
				.extracting(Properties::getPropertyList)
				.isNotNull()
				.satisfies(pl -> pl.getContent().equals("Data"));

	}

	@Test
	@Disabled
	void testResponse(@InjectService XmlaService xmlaService) throws Exception {

		DiscoverResponse discoverResponse = new DiscoverResponse();
		Return r = new Return();
		Rowset rs = new Rowset();
		Row row = new Row();

		rs.getRow().add(row);

		r.setRoot(rs);
		discoverResponse.setReturn(r);

		when(xmlaService.discover(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(discoverResponse);

		SOAPMessage response = callSoapWebService(soapEndpointUrl, SOAP_ACTION_DISCOVER, envelop(""));
		System.out.println(response);

	}

	private static Consumer<SOAPMessage> envelop(String xmlString) throws SOAPException {

		return plainSoapMessage -> {

			try {
				SOAPPart soapPart = plainSoapMessage.getSOAPPart();
				plainSoapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "false");
				SOAPEnvelope envelope = soapPart.getEnvelope();
				envelope.addNamespaceDeclaration("urn", URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS);
				// SOAP Body
				SOAPBody soapBody = envelope.getBody();
				soapBody.addDocument(XMLUtil.stringToDocument(xmlString));

			} catch (SOAPException e) {
				fail(e);
			}
		};
	}

}