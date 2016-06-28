package cn.tanziquan.produce.cole.configure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * DdtalkEnvProperties
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@Configuration
@ConfigurationProperties(prefix="environments.ddtalk")
public class DdtalkEnvProperties {

    private String token;


    private String encodingAesKey;


    private String createSuiteKey;


    public String getEncodingAesKey() {
        return encodingAesKey;
    }

    public void setEncodingAesKey(String encodingAesKey) {
        this.encodingAesKey = encodingAesKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCreateSuiteKey() {
        return createSuiteKey;
    }

    public void setCreateSuiteKey(String createSuiteKey) {
        this.createSuiteKey = createSuiteKey;
    }
}
