package cn.tanziquan.produce.cole.ddtalkapp.service.impl;

import cn.tanziquan.produce.cole.basic.constant.Constant;
import cn.tanziquan.produce.cole.data.domain.CorpAuthInfo;
import cn.tanziquan.produce.cole.data.domain.DdtalkApp;
import cn.tanziquan.produce.cole.data.domain.DdtalkAppCriteria;
import cn.tanziquan.produce.cole.data.domain.DdtalkCropAuth;
import cn.tanziquan.produce.cole.data.persistence.CorpAuthInfoMapper;
import cn.tanziquan.produce.cole.data.persistence.DdtalkAppMapper;
import cn.tanziquan.produce.cole.data.persistence.DdtalkCropAuthMapper;
import cn.tanziquan.produce.cole.ddtalkapp.service.IDdtalkAppService;
import com.dingtalk.open.client.ServiceFactory;
import com.dingtalk.open.client.api.service.corp.CallBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Autowired
    private CorpAuthInfoMapper corpAuthInfoMapper;


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

    @Override
    public void insertCorpAuthInfo(CorpAuthInfo corpAuthInfo) {
        corpAuthInfoMapper.insertSelective(corpAuthInfo);
    }

    @Override
    public void registerCallBack(String token) {
        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            CallBackService callBackService = serviceFactory.getOpenService(CallBackService.class);

            List<String> callBackTag=new ArrayList<>();
            callBackTag.add("user_add_org");
            callBackTag.add("user_modify_org");
            callBackTag.add("user_leave_org");
            callBackTag.add("org_admin_add");
            callBackTag.add("org_admin_remove");
            callBackTag.add("org_dept_create");
            callBackTag.add("org_dept_modify");
            callBackTag.add("org_dept_remove");
            callBackTag.add("org_remove");
            String callBackUrl="http://cole.tanziquan.com/register/receive";
            callBackService.registerCallBack(token, callBackTag,"zhigangtan00001","dwlq23ebzgb90woi8lzuldaim85arxcqvtat32ovwct",callBackUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
