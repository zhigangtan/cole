package cn.tanziquan.produce.cole.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PingController
 *
 * @author zhigang.tan@ele.me
 * @version 0.0.1
 */
@RestController
public class PingController {
    @RequestMapping("/ping")
    public ResponseEntity<?> ping() {
        return ResponseEntity.ok("200");
    }
}
