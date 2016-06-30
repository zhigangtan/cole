package cn.tanziquan.produce.cole.appinfo.service.impl;

import cn.tanziquan.produce.cole.appinfo.service.IAppReleaseService;
import cn.tanziquan.produce.cole.basic.constant.Constant;
import cn.tanziquan.produce.cole.data.domain.AppRelease;
import cn.tanziquan.produce.cole.data.domain.AppReleaseCriteria;
import cn.tanziquan.produce.cole.data.persistence.AppReleaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * AppReleaseServiceImpl
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@Service
public class AppReleaseServiceImpl implements IAppReleaseService {

    @Autowired
    private AppReleaseMapper appReleaseMapper;

    @Override
    public void insertOrUpdateAppRelease(AppRelease appRelease) {
        AppReleaseCriteria criteria=new AppReleaseCriteria();
        criteria.createCriteria().andIsDeleteEqualTo(Constant.NO_S)
                .andBranchEqualTo(appRelease.getBranch()).andAppIdEqualTo(appRelease.getAppId());
        List<AppRelease> appReleases= appReleaseMapper.selectByExample(criteria);
        if(!CollectionUtils.isEmpty(appReleases)){
            appRelease.setId(appReleases.get(0).getId());
            appReleaseMapper.updateByPrimaryKey(appRelease);
        }else{
            appReleaseMapper.insertSelective(appRelease);
        }
    }
}
