package org.eclipse.daanse.xmla.ws.jakarta.emf.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Iterator;
import java.util.UUID;

import javax.xml.namespace.QName;

import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponse;
import org.eclipse.daanse.xmla.model.ecore.xmla.Return;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import jakarta.annotation.Resource;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.soap.AttachmentPart;
import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.Provider;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.ServiceMode;
import jakarta.xml.ws.WebServiceContext;
import jakarta.xml.ws.WebServiceProvider;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.http.HTTPException;

@WebServiceProvider
@ServiceMode(value = Service.Mode.PAYLOAD)
@WebService(name = "MsXmlAnalysisSoapPortType", portName = "MsXmlAnalysisSoapPort", serviceName = "MsXmlAnalysisService", targetNamespace = "urn:schemas-microsoft-com:xml-analysis")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Component
public class EMFProvider implements Provider<SOAPMessage> {
	@Resource
	protected WebServiceContext context;
	
	
	@Reference
	XmlaPackage xmlaPackage;
	
	@Reference
	ComponentServiceObjects<ResourceSet> csoResourceSet;

	public SOAPMessage invoke(SOAPMessage requestMessage) {
		System.out.printf("====%s[start:%tc]====\n", getClass().getName(), Calendar.getInstance());
		ResourceSet resourceSet = null;
		try {
			resourceSet = csoResourceSet.getService();
			String soapBody = requestMessage.getSOAPBody().getTextContent();
			String soapHeader = requestMessage.getSOAPHeader().getTextContent();
			Iterator<AttachmentPart> attachments = requestMessage.getAttachments();
			while (attachments.hasNext()) {
				AttachmentPart part = attachments.next();
				System.out.println(part.getContent());
			}

			System.out.printf("====%s[end:%tc]====\n", getClass().getName(), Calendar.getInstance());

			String s = "xml";

			var resourceIn = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString()), "application/xml");
			try {
				InputStream inStream = new ByteArrayInputStream(soapBody.getBytes(StandardCharsets.UTF_8));

				resourceIn.load(inStream, null);
				EObject eObject = resourceIn.getContents().get(0);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			var resourceOut = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString()), "application/xml");
			
			DiscoverResponse discoverResponse= xmlaPackage.getXmlaFactory().createDiscoverResponse();
			Return returnO= xmlaPackage.getXmlaFactory().createReturn();
			
			
			discoverResponse.setReturn(returnO);
			resourceOut.getContents().add(discoverResponse);

			try {
				resourceOut.save(OutputStream.nullOutputStream(), null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MessageFactory messageFactory = MessageFactory.newInstance();
			SOAPMessage messageOut = messageFactory.createMessage();
			SOAPBody soapBodyOut = messageOut.getSOAPBody();

			SOAPElement element = soapBodyOut.addChildElement(new QName("abc"));
			element.setTextContent("ok");
			return messageOut;
		} catch (Exception e) {
			csoResourceSet.ungetService(resourceSet);
		}
		return null;
	}

	protected MessageContext getMessageContext() {
		MessageContext msgCtx = context.getMessageContext();
		return msgCtx;
	}

	public void printMessageContext() {
		MessageContext mc = getMessageContext();

		for (String key : mc.keySet()) {
			System.out.println(key + ": " + mc.get(key));
		}
		try {
			String method = null;
			String query = null;
			String path = null;

			method = (String) mc.get(MessageContext.HTTP_REQUEST_METHOD);
			query = (String) mc.get(MessageContext.QUERY_STRING);
			path = (String) mc.get(MessageContext.PATH_INFO);
			System.out.println("Request Method = " + method);
			System.out.println("Query String = " + query);
			System.out.println("PathInfo = " + path);

		} catch (Exception e) {
			e.printStackTrace();
			throw new HTTPException(500);
		}
	}
}