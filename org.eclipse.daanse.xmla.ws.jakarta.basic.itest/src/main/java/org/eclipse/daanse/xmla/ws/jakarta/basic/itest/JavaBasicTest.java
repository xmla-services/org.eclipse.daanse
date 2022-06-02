package org.eclipse.daanse.xmla.ws.jakarta.basic.itest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.condition.AllOf.allOf;
import static org.assertj.core.condition.VerboseCondition.verboseCondition;
import static org.eclipse.daanse.xmla.ws.jakarta.basic.itest.SOAPUtil.callSoapWebService;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Hashtable;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.xml.namespace.QName;

import org.assertj.core.condition.MappedCondition;
import org.assertj.core.condition.VerboseCondition;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Discover;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Discover.Restrictions;
import org.eclipse.daanse.xmla.model.jaxb.xmla.DiscoverResponse;
import org.eclipse.daanse.xmla.model.jaxb.xmla.DiscoverResponse.Return;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Properties;
import org.eclipse.daanse.xmla.model.jaxb.xmla.PropertyList;
import org.eclipse.daanse.xmla.model.jaxb.xmla_rowset.Row;
import org.eclipse.daanse.xmla.model.jaxb.xmla_rowset.Rowset;
import org.eclipse.daanse.xmla.ws.jakarta.basic.XmlaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.osgi.annotation.bundle.Capability;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aQute.bnd.properties.PropertiesLineReader;
import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.soap.SOAPPart;

@Capability(namespace = "osgi.service", attribute = "objectClass:List<String>=org.eclipse.daanse.xmla.ws.jakarta.basic.XmlaService")
public class JavaBasicTest {
	private static final String URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS = "urn:schemas-microsoft-com:xml-analysis";

	private Logger logger = LoggerFactory.getLogger(JavaBasicTest.class);

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

	public static String soapEndpointUrl = "http://localhost:8081/xmla";
	public static String SOAP_ACTION_DISCOVER = URN_SCHEMAS_MICROSOFT_COM_XML_ANALYSIS + ":Discover";

	@InjectBundleContext
	BundleContext bc;

	private XmlaService xmlaService;
	private ArgumentCaptor<Discover> dicoverCaptor;

	@BeforeEach
	void beforaEach() {
		xmlaService = mock(XmlaService.class);
		dicoverCaptor = ArgumentCaptor.forClass(Discover.class);
		bc.registerService(XmlaService.class, xmlaService, new Hashtable<>());
	}

	@Test
	void testRequest() throws Exception {

		String discoverText = """
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

		callSoapWebService(soapEndpointUrl, SOAP_ACTION_DISCOVER, envelop(discoverText));

		verify(xmlaService, (times(1))).discover(dicoverCaptor.capture(), isNull(), isNull(), isNull());

		var discoverAssert = assertThat(dicoverCaptor.getValue());

		discoverAssert.is(//
				allOf(//
						notNull(), //
						map(Discover::getRequestType, //
								allOf(//
										notNull(), //
										equalTo("MDSCHEMA_CUBES"))), //
						map(Discover::getRestrictions, //
								allOf(//
										notNull(), //
										map(Restrictions::getRestrictionList, equalTo(null)))), //
						map(Discover::getProperties, //
								allOf(//
										notNull(), //
										map(Properties::getPropertyList, //
												allOf(//
														notNull(), //
														map(PropertyList::getContent, //
																allOf(//
																		notNull(), //
																		equalTo("Data1")//
																))))))));

		discoverAssert.extracting(Discover::getRequestType)
				.isNotNull()
				.isEqualTo("MDSCHEMA_CUBES");

		discoverAssert.extracting(Discover::getRestrictions)
				.isNotNull()
				.extracting(Restrictions::getRestrictionList)
				.isNull();

		discoverAssert.extracting(Discover::getProperties)
				.isNotNull()
				.extracting(Properties::getPropertyList)
				.isNotNull()
				.satisfies(pl -> pl.getContent()
						.equals("Data"));

	}

	private static MappedCondition<Discover, String> requestType(org.assertj.core.api.Condition<String> condition) {
		return MappedCondition.mappedCondition(Discover::getRequestType, condition);
	}

	private static <FROM, TO> MappedCondition<FROM, TO> map(Function<FROM, TO> mapping,
			org.assertj.core.api.Condition<TO> condition) {
		return MappedCondition.mappedCondition(mapping, condition);
	}

	private static VerboseCondition<Discover> requestType(String requestType) {
		return verboseCondition(d -> d.getRequestType()
				.equals(requestType), String.format("type: %s ", requestType),
				d -> String.format("but was: %s", d.getRequestType()));
	}

	private static <T> VerboseCondition<T> equalTo(T otherObject) {
		return verboseCondition(o -> Objects.equals(o, otherObject), String.format("equals: %s ", otherObject),
				o -> String.format("but was: %s", o));
	}

	private static VerboseCondition<Object> notNull() {
		return verboseCondition(o -> Objects.nonNull(o), String.format("notNull "), o -> String.format("but was: %s", o));
	}

	@Test
	@Disabled
	void testResponse() throws Exception {

		DiscoverResponse discoverResponse = new DiscoverResponse();
		Return r = new Return();
		Rowset rs = new Rowset();
		Row row = new Row();
		rs.getRow()
				.add(row);
		r.setRoot(rs);
		discoverResponse.setReturn(r);

		when(xmlaService.discover(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(discoverResponse);

		SOAPMessage response = callSoapWebService(soapEndpointUrl, SOAP_ACTION_DISCOVER, envelop(""));

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
