package cn.tanziquan.produce.cole.appinfo.service.impl;

import cn.tanziquan.produce.cole.appinfo.service.IAppWebhooksRecordService;
import cn.tanziquan.produce.cole.data.domain.AppWebhooksRecord;
import cn.tanziquan.produce.cole.data.domain.AppWebhooksRecordCriteria;
import cn.tanziquan.produce.cole.data.persistence.AppWebhooksRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * AppWebhooksRecordServiceImpl
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@Service
public class AppWebhooksRecordServiceImpl implements IAppWebhooksRecordService {


    @Autowired
    private AppWebhooksRecordMapper appWebhooksRecordMapper;

    @Override
    public AppWebhooksRecord getAppWebhooksRecordByAppId(Integer appId) {
        AppWebhooksRecordCriteria criteria = new AppWebhooksRecordCriteria();
        criteria.createCriteria().andAppIdEqualTo(appId);
        criteria.setOrderByClause("id desc");
        List<AppWebhooksRecord> appWebhooksRecords = appWebhooksRecordMapper.selectByExample(criteria);
        if (!CollectionUtils.isEmpty(appWebhooksRecords)) {
            return appWebhooksRecords.get(0);
        }
        return null;
    }
}
