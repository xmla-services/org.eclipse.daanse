package org.eclipse.daanse.xmla.ws.jakarta.basic.itest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Hashtable;

import org.assertj.core.api.Assertions;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Discover;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Discover.Restrictions;
import org.eclipse.daanse.xmla.model.jaxb.xmla.DiscoverResponse;
import org.eclipse.daanse.xmla.model.jaxb.xmla.DiscoverResponse.Return;
import org.eclipse.daanse.xmla.model.jaxb.xmla.Properties;
import org.eclipse.daanse.xmla.model.jaxb.xmla_rowset.Row;
import org.eclipse.daanse.xmla.model.jaxb.xmla_rowset.Rowset;
import org.eclipse.daanse.xmla.ws.jakarta.basic.XmlaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aQute.bnd.annotation.service.ServiceCapability;

@ServiceCapability(XmlaService.class)
@EnabledOnOs(OS.WINDOWS)
public class MsClientTest {
	private Logger logger = LoggerFactory.getLogger(MsClientTest.class);

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
	@EnabledOnOs(OS.WINDOWS)
	void testRequest_1(@InjectService XmlaService xmlaService) throws Exception {

		//prepare response
		DiscoverResponse discoverResponse = new DiscoverResponse();
		Return r = new Return();
		Rowset rs = new Rowset();
		Row row = new Row();
		
		rs.getRow().add(row);
		
		r.setRoot(rs);
		discoverResponse.setReturn(r);
		
		when(xmlaService.discover(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(discoverResponse);

		//call test
		Process process=callByMsClient("Test1");

		//verify request
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

//		verify client 
		
		byte[] errors=	process.getErrorStream().readAllBytes();
		byte[] info=	process.getInputStream().readAllBytes();
		
		
		process.exitValue();
		logger.info(new String(info));
		logger.error(new String(errors));
		
		Assertions.assertThat(errors).isEmpty();
		Assertions.assertThat(process.exitValue()).isEqualTo(0);

	}

	private Process callByMsClient(String value) throws IOException {

		ProcessBuilder processBuilder = new ProcessBuilder("XmlaTestClient.exe", "-runtest", value);
		processBuilder.inheritIO();
		Process p = processBuilder.start();
		return p;

	}

}
