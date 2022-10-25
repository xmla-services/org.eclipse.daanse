package org.eclipse.daanse.mdx.xtext.lsp;

import org.eclipse.xtext.ide.server.LanguageServerImpl;

import com.google.inject.Inject;

public class XtextLspLauncher {

    @Inject
    private LanguageServerImpl languageServer;

    public LanguageServerImpl getLanguageServer() {
        return languageServer;
    }

}
