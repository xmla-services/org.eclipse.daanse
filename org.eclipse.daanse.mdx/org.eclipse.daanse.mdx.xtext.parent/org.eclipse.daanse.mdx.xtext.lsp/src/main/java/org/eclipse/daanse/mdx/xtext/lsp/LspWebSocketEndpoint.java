package org.eclipse.daanse.mdx.xtext.lsp;

import java.util.Collection;

import org.eclipse.lsp4j.jsonrpc.Launcher.Builder;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.LanguageClientAware;
import org.eclipse.lsp4j.websocket.jakarta.WebSocketEndpoint;
import org.eclipse.xtext.ide.server.ServerModule;

import com.google.inject.Guice;
import com.google.inject.Module;

public class LspWebSocketEndpoint extends WebSocketEndpoint<LanguageClient> {

    @Override
    protected void configure(Builder<LanguageClient> builder) {

        Module[] modules = new com.google.inject.Module[] { new ServerModule() };

        XtextLspLauncher launcher = Guice.createInjector(modules).<XtextLspLauncher>getInstance(XtextLspLauncher.class);

        builder.setLocalService(launcher.getLanguageServer());
        builder.setRemoteInterface(LanguageClient.class);
    }

    @Override
    protected void connect(Collection<Object> localServices, LanguageClient remoteProxy) {
        localServices.stream()
                .filter(LanguageClientAware.class::isInstance)
                .forEach(languageClientAware -> ((LanguageClientAware) languageClientAware).connect(remoteProxy));
    }
}