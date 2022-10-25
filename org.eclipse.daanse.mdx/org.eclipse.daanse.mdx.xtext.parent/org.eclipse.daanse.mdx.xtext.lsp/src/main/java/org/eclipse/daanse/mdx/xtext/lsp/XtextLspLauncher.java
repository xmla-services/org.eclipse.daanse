package org.eclipse.daanse.mdx.xtext.lsp;

import java.util.concurrent.Future;

import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.eclipse.xtext.ide.server.LaunchArgs;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

import com.google.inject.Inject;

public class XtextLspLauncher {

  @Inject
  private LanguageServerImpl languageServer;

  public void start(LaunchArgs args) {
    try {
      InputOutput.println("Language Server is starting.");
      Launcher<LanguageClient> launcher = Launcher.createLauncher(languageServer, LanguageClient.class, args.getIn(),
          args.getOut(), args.isValidate(), args.getTrace());
      languageServer.connect(launcher.getRemoteProxy());
      Future<Void> listeningFuture = launcher.startListening();
      InputOutput.println("Language Server has been started.");
      while (!listeningFuture.isDone()) {
        InputOutput.println("Language Server terminated.");

        Thread.sleep(10_000L);
      }
    } catch (InterruptedException e) {
      throw Exceptions.sneakyThrow(e);
    }
  }

}
