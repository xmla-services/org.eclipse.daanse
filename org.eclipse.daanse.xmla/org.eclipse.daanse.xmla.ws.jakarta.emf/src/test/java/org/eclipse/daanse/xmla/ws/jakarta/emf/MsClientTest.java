package org.eclipse.daanse.xmla.ws.jakarta.emf;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.eclipse.daanse.xmla.model.ecore.xmla.Discover;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponse;
import org.eclipse.daanse.xmla.model.ecore.xmla.Properties;
import org.eclipse.daanse.xmla.model.ecore.xmla.Restrictions;
import org.eclipse.daanse.xmla.model.ecore.xmla.Return;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaFactory;
import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Row;
import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Rowset;
import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Xmla_rowsetFactory;
import org.eclipse.daanse.xmla.ws.jakarta.emf.XmlaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aQute.bnd.annotation.service.ServiceCapability;

@ServiceCapability(XmlaService.class)
//@EnabledOnOs(OS.WINDOWS)
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
  void testRequest_1(@InjectService XmlaService xmlaService) throws Exception {

    Thread.sleep(6000);
    // prepare response
    DiscoverResponse discoverResponse = XmlaFactory.eINSTANCE.createDiscoverResponse();

    Return r = XmlaFactory.eINSTANCE.createReturn();
    Rowset rs = Xmla_rowsetFactory.eINSTANCE.createRowset();
    Row row = Xmla_rowsetFactory.eINSTANCE.createRow();

    rs.getRow().add(row);

    r.setRoot1(rs);
    discoverResponse.setReturn(r);

    when(xmlaService.discover(Mockito.any())).thenReturn(discoverResponse);

    // call test

    Process process = callByMsClient("schema", "MDSCHEMA_CUBES");

    byte[] errors = process.getErrorStream().readAllBytes();
    byte[] info = process.getInputStream().readAllBytes();
    process.waitFor(100000, TimeUnit.SECONDS);

    System.out.println(info);

    System.out.println(errors);
    logger.info(new String(info));
    logger.error(new String(errors));

    Assertions.assertThat(errors).isEmpty();
    Assertions.assertThat(process.exitValue()).isEqualTo(0);

    // verify request
    verify(xmlaService, (Mockito.atLeastOnce())).discover(dicoverCaptor.capture());

    var discoverAssert = assertThat(dicoverCaptor.getAllValues().get(0));

    discoverAssert.extracting(Discover::getRequestType).isNotNull().isEqualTo("DISCOVER_PROPERTIES");

    discoverAssert.extracting(Discover::getRestrictions)
        .isNotNull()
        .extracting(Restrictions::getRestrictionList)
        .isNull();

    discoverAssert.extracting(Discover::getProperties)
        .isNotNull()
        .extracting(Properties::getPropertyList)
        .isNotNull()
        .satisfies(pl -> pl.getLocaleIdentifier().equals(new BigInteger("1033")));

//		verify client 

  }

  private Process callByMsClient(String... values) throws IOException {
    String dotNet = System.getProperty("user.home") + "/.dotnet/dotnet";

    final var cmds = new ArrayList<String>();
    cmds.add(dotNet);
    cmds.add("run");
    cmds.add("Data source=http://localhost:8081/xmla;UID=Domain\\User;PWD=UserDomainPassword");

    Stream.of(values).forEach(v -> cmds.add(v));

    System.out.println(cmds);

    ProcessBuilder processBuilder = new ProcessBuilder(cmds);
    processBuilder.inheritIO();
    processBuilder.directory(Paths.get("../../../../../MsAdomdClientTester/").toAbsolutePath().toFile());

    Process p = processBuilder.start();

    return p;

  }

}
