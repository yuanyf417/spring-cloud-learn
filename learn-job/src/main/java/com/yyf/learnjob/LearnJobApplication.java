package com.yyf.learnjob;

import com.yyf.learnjob.config.LearnXxlJobProperties;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "3m")
@EnableConfigurationProperties(LearnXxlJobProperties.class)
public class LearnJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnJobApplication.class, args);
    }

}
