package com.yyf.learnstreamoutput;

import com.yyf.learnstreamoutput.client.DemoClient;
import com.yyf.learnstreamoutput.dto.DemoMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class LearnStreamOutputApplication {

    @Bean
    public Function<DemoMessage, DemoMessage> notifyDemo(DemoClient demoClient) {
        return demoClient::process;
    }

    public static void main(String[] args) {
        SpringApplication.run(LearnStreamOutputApplication.class, args);
    }

}
