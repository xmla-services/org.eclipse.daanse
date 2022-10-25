package org.eclipse.daanse.mdx.xtext.lsp;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest;
import org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse;
import org.eclipse.jetty.websocket.servlet.WebSocketCreator;
import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import jakarta.servlet.Servlet;

@Component(service = Servlet.class)
@HttpWhiteboardServletPattern("lsp")
public class LanguageServerServlet extends WebSocketServlet {

  private BundleContext bc;

  @Activate
  public void act(BundleContext bc) {
    this.bc = bc;
  }

  private static ClassLoader loader = null;

  private static void findJettyClassLoader(BundleContext context) {
    Bundle[] bundles = context.getBundles();
    for (Bundle bundle : bundles) {
      if ("org.apache.felix.http.jetty".equals(bundle.getSymbolicName())) {
        try {
          BundleWiring wire = bundle.adapt(BundleWiring.class);
          loader = wire.getClassLoader();
        } catch (Exception e) {
          e.printStackTrace();
          loader = WebSocketServlet.class.getClassLoader();
        }
        break;
      }
    }
  }

  private static final long serialVersionUID = 1L;

  private final AtomicBoolean firstCall = new AtomicBoolean(true);

  private final CountDownLatch initBarrier = new CountDownLatch(1);

  @Override
  public void init() throws ServletException {
    System.out.println(
        "The Echo servlet has been initialized, but we delay initialization until the first request so that a Jetty Context is available");
  }

  @Override
  public void configure(WebSocketServletFactory webSocketServletFactory) {
    webSocketServletFactory.setCreator(new WebSocketCreator() {

      @Override
      public Object createWebSocket(ServletUpgradeRequest arg0, ServletUpgradeResponse arg1) {
        // TODO Auto-generated method stub
        return null;
      }
    });
  }

  @Override
  public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
    if (firstCall.compareAndSet(true, false)) {
      try {
        delayedInit();
      } finally {
        initBarrier.countDown();
      }
    } else {
      try {
        initBarrier.await();
      } catch (InterruptedException e) {
        throw new ServletException("Timed out waiting for initialisation", e);
      }
    }
    super.service(arg0, arg1);
  }

  private void delayedInit() throws ServletException {
    Thread currentThread = Thread.currentThread();
    ClassLoader tccl = currentThread.getContextClassLoader();
    currentThread.setContextClassLoader(loader);
    try {
      super.init();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      currentThread.setContextClassLoader(tccl);
    }
  }

}
