package cn.tanziquan.produce.cole.configure;

import cn.tanziquan.produce.cole.configure.properties.DBProperties;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Autowired
    private DBProperties dbProperties;

    @Bean(initMethod = "init", destroyMethod = "close")
    DataSource dataSource() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(dbProperties.getDriverClassName());
        dataSource.setUrl(dbProperties.getJdbcUrl());
        dataSource.setUsername(dbProperties.getJdbcUser());
        dataSource.setPassword(dbProperties.getJdbcPwd());
        dataSource.setInitialSize(20);
        dataSource.setMinIdle(0);
        dataSource.setMaxActive(100);
        dataSource.setMaxWait(60000);
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        dataSource.setMinEvictableIdleTimeMillis(300000);
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        return dataSource;

    }

}
