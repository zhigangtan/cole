package cn.tanziquan.produce.cole.gitdeploy.dto;

import java.util.List;

/**
 * BuildDto
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class BuildDto {

    private String language;


    private String sdk_version;

    private List<String> script;

    private List<String> after_success;

    private String outfile;


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSdk_version() {
        return sdk_version;
    }

    public void setSdk_version(String sdk_version) {
        this.sdk_version = sdk_version;
    }

    public List<String> getScript() {
        return script;
    }

    public void setScript(List<String> script) {
        this.script = script;
    }

    public List<String> getAfter_success() {
        return after_success;
    }

    public void setAfter_success(List<String> after_success) {
        this.after_success = after_success;
    }

    public String getOutfile() {
        return outfile;
    }

    public void setOutfile(String outfile) {
        this.outfile = outfile;
    }
}
