package cn.tanziquan.produce.cole.ddtalkapp.dto;

/**
 * GetUserInfoResponse
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class GetUserInfoResponse {


    private SSOCorpInfo corp_info;


    private SSOUserInfo user_info;

    public SSOCorpInfo getCorp_info() {
        return corp_info;
    }

    public void setCorp_info(SSOCorpInfo corp_info) {
        this.corp_info = corp_info;
    }

    public SSOUserInfo getUser_info() {
        return user_info;
    }

    public void setUser_info(SSOUserInfo user_info) {
        this.user_info = user_info;
    }
}
