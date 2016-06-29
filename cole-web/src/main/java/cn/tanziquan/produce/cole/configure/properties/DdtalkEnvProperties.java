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


    private String suiteKey;

    private String suiteSecret;


    private String corpId;

    private String corpSecret;


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

    public String getSuiteKey() {
        return suiteKey;
    }

    public void setSuiteKey(String suiteKey) {
        this.suiteKey = suiteKey;
    }

    public String getSuiteSecret() {
        return suiteSecret;
    }

    public void setSuiteSecret(String suiteSecret) {
        this.suiteSecret = suiteSecret;
    }

    public String getCorpSecret() {
        return corpSecret;
    }

    public void setCorpSecret(String corpSecret) {
        this.corpSecret = corpSecret;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }
}
