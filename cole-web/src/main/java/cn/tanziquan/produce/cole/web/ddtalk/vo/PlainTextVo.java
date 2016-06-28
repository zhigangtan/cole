package cn.tanziquan.produce.cole.web.ddtalk.vo;

/**
 * PlainTextVo
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class PlainTextVo {


    private String EventType;


    private String Random;


    private String SuiteKey;

    private String TimeStamp;

    private String TestSuiteKey;

    private String SuiteTicket;


    private String AuthCode;


    private String AuthCorpId;


    public String getRandom() {
        return Random;
    }

    public void setRandom(String random) {
        Random = random;
    }

    public String getEventType() {
        return EventType;
    }

    public void setEventType(String eventType) {
        EventType = eventType;
    }

    public String getTestSuiteKey() {
        return TestSuiteKey;
    }

    public void setTestSuiteKey(String testSuiteKey) {
        TestSuiteKey = testSuiteKey;
    }

    public String getAuthCode() {
        return AuthCode;
    }

    public void setAuthCode(String authCode) {
        AuthCode = authCode;
    }

    public String getAuthCorpId() {
        return AuthCorpId;
    }

    public void setAuthCorpId(String authCorpId) {
        AuthCorpId = authCorpId;
    }

    public String getSuiteKey() {
        return SuiteKey;
    }

    public void setSuiteKey(String suiteKey) {
        SuiteKey = suiteKey;
    }

    public String getSuiteTicket() {
        return SuiteTicket;
    }

    public void setSuiteTicket(String suiteTicket) {
        SuiteTicket = suiteTicket;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        TimeStamp = timeStamp;
    }
}
