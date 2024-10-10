package com.yyf.learnjob.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author YYF 2024/10/11 2024/10/11.
 */
@ConfigurationProperties(prefix = "learn.job")
@Data
public class LearnXxlJobProperties {

    private String adminAddresses;
    private String appName;
    private String ip;
    private int port;
    private String accessToken;
    private String logPath;
    private int logRetentionDays;

}
