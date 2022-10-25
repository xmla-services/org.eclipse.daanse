package org.eclipse.daanse.mdx.xtext.lsp;

import org.glassfish.tyrus.server.Server;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.websocket.DeploymentException;

@Component(immediate = true)
public class WebSocketRunner {

    @interface Config {
        String hostname() default "127.0.0.1";

        int port() default 5000;

        String contextPath() default "/";

    }

    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketRunner.class);

    private Server server;

    @Activate
    private void activate(Config config) throws InterruptedException, DeploymentException {

        server = new Server(config.hostname(), config.port(), config.contextPath(), null,
                LspWebSocketServerConfigProvider.class);
        Runtime.getRuntime().addShutdownHook(new Thread(server::stop, "trino-lsp-websocket-server-shutdown-hook"));

        try {
            server.start();
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            LOGGER.error("LSP Websocket server has been interrupted.", e);
            Thread.currentThread().interrupt();
            throw e;
        } catch (DeploymentException e) {
            LOGGER.error("Cannot start LSP Websocket server.", e);
            throw e;
        } finally {
            server.stop();
        }
    }

    @Deactivate
    public void deactivate() {
        if (server != null) {
            server.stop();
        }

    }
}