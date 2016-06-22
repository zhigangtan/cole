package cn.tanziquan.produce.cole.web.appinfo;

import cn.tanziquan.produce.cole.appinfo.dto.AppMainDto;
import cn.tanziquan.produce.cole.appinfo.service.IAppInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * AppInfoController
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
@RestController
@RequestMapping(value = "/cole-api/app")
public class AppInfoController {

    private static final Logger logger = LoggerFactory.getLogger(AppInfoController.class);

    @Autowired
    private IAppInfoService appInfoService;

    @RequestMapping(value = "/get/{appNo:.+}", method = RequestMethod.GET)
    public ResponseEntity<AppMainDto> getApp(@PathVariable(value = "appNo") String appNo) {
        AppMainDto appMainDto = appInfoService.getAppMainDtoByAppNo(appNo);
        return ResponseEntity.ok(appMainDto);
    }
}
