package cn.tanziquan.produce.cole.configure;

import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * WebConfig
 *
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
