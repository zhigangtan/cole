package cn.tanziquan.produce.cole.config;

import org.eclipse.jetty.server.Server;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyServerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * WebConfig
 *
 * @author zhigang.tan@ele.me
 * @version 0.0.1
 */
@Configuration
public class WebConfig {

    @Bean
    public JettyEmbeddedServletContainerFactory embeddedServletContainerFactory() {
        JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory(9010);
        return factory;
    }
}
