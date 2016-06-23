package cn.tanziquan.produce.cole.appinfo.service;

import cn.tanziquan.produce.cole.data.domain.AppWebhooksRecord;

/**
 * IAppWebhooksRecordService
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public interface IAppWebhooksRecordService {




    AppWebhooksRecord getAppWebhooksRecordByAppId(Integer appId);
}
