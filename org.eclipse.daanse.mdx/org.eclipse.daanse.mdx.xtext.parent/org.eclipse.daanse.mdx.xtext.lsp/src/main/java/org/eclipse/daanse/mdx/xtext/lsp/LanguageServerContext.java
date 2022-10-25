package org.eclipse.daanse.mdx.xtext.lsp;

import org.eclipse.xtext.ide.server.LaunchArgs;
import org.eclipse.xtext.ide.server.ServerModule;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import com.google.inject.Guice;

@Component(immediate = true)
public class LanguageServerContext {

  com.google.inject.Module[] modules;
  private WebSocketRunner webSocketRunner;

  @Activate
  private void act() {

    webSocketRunner = new WebSocketRunner();
    String contextPath = "/foo";
    String hostname = "localhost";
    int port = 8025;
    webSocketRunner.runWebSocketServer(hostname, port, contextPath);

    modules = new com.google.inject.Module[] { new ServerModule() };
    LaunchArgs launchArgs = createLaunchArgs();

    XtextLspLauncher launcher = Guice.createInjector(modules).<XtextLspLauncher>getInstance(XtextLspLauncher.class);
    launcher.start(launchArgs);
  }

  private LaunchArgs createLaunchArgs() {
    LaunchArgs launchArgs = new LaunchArgs();
    launchArgs.setIn(System.in);
    launchArgs.setOut(System.out);
    launchArgs.setTrace(null);
    launchArgs.setValidate(false);
    return launchArgs;
  }

}
