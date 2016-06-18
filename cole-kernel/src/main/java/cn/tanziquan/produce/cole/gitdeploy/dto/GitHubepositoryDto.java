package cn.tanziquan.produce.cole.gitdeploy.dto;

import cn.tanziquan.produce.cole.basic.dto.BasicDto;

/**
 * GitHubepositoryDto
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class GitHubepositoryDto extends BasicDto {



    private long id;


    private String name;


    private String full_name;


    private String html_url;


    private  String url;


    private String git_url;


    private String ssh_url;


    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getGit_url() {
        return git_url;
    }

    public void setGit_url(String git_url) {
        this.git_url = git_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsh_url() {
        return ssh_url;
    }

    public void setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
