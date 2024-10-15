package com.yyf.learnnacosconfig;

import com.yyf.learnnacosconfig.config.RemoteConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableConfigurationProperties(RemoteConfig.class)
@SpringBootApplication
public class LearnNacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnNacosConfigApplication.class, args);
    }

}
