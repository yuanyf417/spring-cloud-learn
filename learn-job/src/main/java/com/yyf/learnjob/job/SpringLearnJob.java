package com.yyf.learnjob.job;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * description
 *
 * @author YYF 2024/10/09 2024/10/9.
 */
@Component
public class SpringLearnJob {

    /**
     * 每5分钟跑一次
     */
    @Scheduled(cron = "0 */5 * * * ?")
    @SchedulerLock(name = "SpringJob.job1", lockAtMostFor = "2m", lockAtLeastFor = "1m")
    public void job1() {
        System.out.println("time=" + LocalDateTime.now() + " do job1...");
    }

    /**
     * 每5秒跑一次
     */
    @Scheduled(fixedRate = 5000)
    @SchedulerLock(name = "SpringJob.job2", lockAtMostFor = "4s", lockAtLeastFor = "4s")
    public void job2() {
        System.out.println("time=" + LocalDateTime.now() + " do job2...");
    }

    /**
     * 上次跑完之后隔5秒再跑
     * @throws InterruptedException
     */
    @Scheduled(fixedDelay = 5000)
    @SchedulerLock(name = "SpringJob.job3", lockAtMostFor = "4s", lockAtLeastFor = "4s")
    public void job3() throws InterruptedException {
        System.out.println("time=" + LocalDateTime.now() + " do job3...");
        Thread.sleep(10000);
    }
}
