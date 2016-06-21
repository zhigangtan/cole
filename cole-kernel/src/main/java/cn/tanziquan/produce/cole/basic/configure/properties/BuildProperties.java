package cn.tanziquan.produce.cole.basic.configure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * BuildProperties
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@Configuration
@ConfigurationProperties(prefix="environments.build")
public class BuildProperties {

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
