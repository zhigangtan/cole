package cn.tanziquan.produce.cole.ddtalkapp.service.impl;

import cn.tanziquan.produce.cole.basic.constant.Constant;
import cn.tanziquan.produce.cole.data.domain.DdtalkApp;
import cn.tanziquan.produce.cole.data.domain.DdtalkAppCriteria;
import cn.tanziquan.produce.cole.data.domain.DdtalkCropAuth;
import cn.tanziquan.produce.cole.data.persistence.DdtalkAppMapper;
import cn.tanziquan.produce.cole.data.persistence.DdtalkCropAuthMapper;
import cn.tanziquan.produce.cole.ddtalkapp.service.IDdtalkAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * DdtalkAppServiceImpl
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@Service
public class DdtalkAppServiceImpl implements IDdtalkAppService {


    @Autowired
    private DdtalkAppMapper ddtalkAppMapper;

    @Autowired
    private DdtalkCropAuthMapper ddtalkCropAuthMapper;


    @Override
    public DdtalkApp getDdtalkApp(String eventType) {
        DdtalkAppCriteria criteria = new DdtalkAppCriteria();
        criteria.createCriteria().andEventTypeEqualTo(eventType).andIsDeleteEqualTo(Constant.NO_S);
        List<DdtalkApp> ddtalkApps = ddtalkAppMapper.selectByExample(criteria);
        if (!CollectionUtils.isEmpty(ddtalkApps)) {
            return ddtalkApps.get(0);
        }
        return null;
    }

    @Override
    public void insertOrUpdate(DdtalkApp ddtalkApp) {
        if(ddtalkApp.getId()!=null){
            ddtalkAppMapper.updateByPrimaryKeySelective(ddtalkApp);
        }else{
            ddtalkAppMapper.insertSelective(ddtalkApp);
        }
    }

    @Override
    public void insertOrUpdateDdtalkCropAuth(DdtalkCropAuth ddtalkCropAuth) {
        if(ddtalkCropAuth.getId()!=null){
            ddtalkCropAuthMapper.updateByPrimaryKeySelective(ddtalkCropAuth);
        }else{
            ddtalkCropAuthMapper.insertSelective(ddtalkCropAuth);
        }
    }
}
