package cn.tanziquan.produce.cole.ddtalkapp.service;

import cn.tanziquan.produce.cole.data.domain.DdtalkApp;
import cn.tanziquan.produce.cole.data.domain.DdtalkCropAuth;

/**
 * IDdtalkAppService
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public interface IDdtalkAppService {


    public DdtalkApp getDdtalkApp(String eventType);


    public void insertOrUpdate(DdtalkApp ddtalkApp);


    public void insertOrUpdateDdtalkCropAuth(DdtalkCropAuth ddtalkCropAuth);
}
