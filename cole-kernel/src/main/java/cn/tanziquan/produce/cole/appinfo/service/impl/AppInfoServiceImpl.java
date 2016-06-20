package cn.tanziquan.produce.cole.appinfo.service.impl;

import cn.tanziquan.produce.cole.appinfo.service.IAppInfoService;
import cn.tanziquan.produce.cole.basic.constant.Constant;
import cn.tanziquan.produce.cole.data.domain.AppInfo;
import cn.tanziquan.produce.cole.data.domain.AppInfoCriteria;
import cn.tanziquan.produce.cole.data.persistence.AppInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AppInfoServiceImpl
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@Service
public class AppInfoServiceImpl implements IAppInfoService {

    @Autowired
    private AppInfoMapper appInfoMapper;


    @Override
    public List<AppInfo> getAllAppInfo() {
        AppInfoCriteria criteria = new AppInfoCriteria();
        criteria.createCriteria().andIsDeleteEqualTo(Constant.NO_S);
        List<AppInfo> appInfos = appInfoMapper.selectByExample(criteria);
        return appInfos;
    }


}
