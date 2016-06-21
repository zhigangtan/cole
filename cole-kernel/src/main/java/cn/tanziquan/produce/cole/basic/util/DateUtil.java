package cn.tanziquan.produce.cole.basic.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * DateUtil
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class DateUtil {

    public static java.sql.Timestamp getCurrentTimestamp() {
        return Timestamp.valueOf(LocalDateTime.now());
    }
}
