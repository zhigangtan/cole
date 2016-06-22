package cn.tanziquan.produce.cole.gitdeploy.dto.github;

import java.sql.Timestamp;

/**
 * GitHubHeadCommitDto
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class GitHubHeadCommitDto {

    private String message;


    private GitHubCommitterDto committer;

    private Timestamp timestamp;


    public GitHubCommitterDto getCommitter() {
        return committer;
    }

    public void setCommitter(GitHubCommitterDto committer) {
        this.committer = committer;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
