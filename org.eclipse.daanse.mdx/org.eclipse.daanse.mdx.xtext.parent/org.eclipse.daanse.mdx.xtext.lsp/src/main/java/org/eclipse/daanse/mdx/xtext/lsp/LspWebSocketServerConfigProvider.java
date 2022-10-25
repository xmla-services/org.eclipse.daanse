package org.eclipse.daanse.mdx.xtext.lsp;

import java.util.Collections;
import java.util.Set;

import jakarta.websocket.Endpoint;
import jakarta.websocket.server.ServerApplicationConfig;
import jakarta.websocket.server.ServerEndpointConfig;

public class LspWebSocketServerConfigProvider implements ServerApplicationConfig {

    public static final String WEBSOCKET_SERVER_PATH = "/mdx";

    @Override
    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> endpointClasses) {
        ServerEndpointConfig conf = ServerEndpointConfig.Builder
                .create(LspWebSocketEndpoint.class, WEBSOCKET_SERVER_PATH)
                .build();
        return Collections.singleton(conf);
    }

    @Override
    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scanned) {
        return scanned;
    }

}