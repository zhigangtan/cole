package cn.tanziquan.produce.cole.gitdeploy.dto;

import cn.tanziquan.produce.cole.basic.dto.BasicDto;

/**
 * GitHubRequestBodyDto
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class GitHubRequestBodyDto extends BasicDto {

    private String ref;

    private String before;

    private String after;

    private boolean created;

    private boolean deleted;

    private boolean forced;


    private GitHubepositoryDto repository;


    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public boolean isCreated() {
        return created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isForced() {
        return forced;
    }

    public void setForced(boolean forced) {
        this.forced = forced;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public GitHubepositoryDto getRepository() {
        return repository;
    }

    public void setRepository(GitHubepositoryDto repository) {
        this.repository = repository;
    }
}
