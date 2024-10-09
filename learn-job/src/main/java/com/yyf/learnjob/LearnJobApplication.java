package com.yyf.learnjob;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "3m")
public class LearnJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnJobApplication.class, args);
    }

}
