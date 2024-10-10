package com.yyf.learnjob.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 *
 * @author YYF 2024/10/11 2024/10/11.
 */
@Slf4j
@Configuration
public class LearnXxlJobConfig {

    @Bean
    public XxlJobSpringExecutor xxlJobExecutor( LearnXxlJobProperties learnXxlJobProperties) {
        log.info(">>>>>>>>>>> xxl-job config init.");
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(learnXxlJobProperties.getAdminAddresses());
        xxlJobSpringExecutor.setAppname(learnXxlJobProperties.getAppName());
        xxlJobSpringExecutor.setIp(learnXxlJobProperties.getIp());
        xxlJobSpringExecutor.setPort(learnXxlJobProperties.getPort());
        xxlJobSpringExecutor.setAccessToken(learnXxlJobProperties.getAccessToken());
        xxlJobSpringExecutor.setLogPath(learnXxlJobProperties.getLogPath());
        xxlJobSpringExecutor.setLogRetentionDays(learnXxlJobProperties.getLogRetentionDays());
        return xxlJobSpringExecutor;
    }
}
