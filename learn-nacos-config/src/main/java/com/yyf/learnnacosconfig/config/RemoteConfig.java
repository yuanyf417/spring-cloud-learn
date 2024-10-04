package com.yyf.learnnacosconfig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 可以自动刷新?
 *
 * @author YYF 2024/10/04 2024/10/4.
 */
@ConfigurationProperties(prefix = "yyf.remote")
@Component
@Data
public class RemoteConfig {

    private String name;
    private int age;

}
