package com.example.WebsocketFilims;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;

@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketConfiguration.class);
    @Bean
    public ServletServerContainerFactoryBean createWebSocketContainer() {
    	LOGGER.info("createWebSocketContainer ... !!");
        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
        container.setMaxBinaryMessageBufferSize(1024000);
        return container;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
    	LOGGER.info("registerWebSocketHandlers ... !!");
        registry.addHandler(new WebSocketHandler(), "/socket").setAllowedOrigins("*");
    }
}

