package com.example.demo.lab2.Config;

import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DualServerConfig {

    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> mvcServer() {
        return factory -> factory.setPort(8080); // Tomcat для MVC
    }

    @Bean
    public WebServerFactoryCustomizer<NettyReactiveWebServerFactory> webfluxServer() {
        return factory -> factory.setPort(8081); // Netty для WebFlux
    }
}
