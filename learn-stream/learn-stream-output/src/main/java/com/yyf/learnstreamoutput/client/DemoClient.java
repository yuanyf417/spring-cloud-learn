package com.yyf.learnstreamoutput.client;

import com.yyf.learnstreamoutput.dto.DemoMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author YYF 2024/10/22 2024/10/22.
 */
@Slf4j
@Component
public class DemoClient {

    public DemoMessage process(DemoMessage message) {
        var messageId = message.getMessageId();
        log.info("process messageId={}", messageId);
        return DemoMessage.builder()
                .messageId(messageId)
                .message("demo-xxx")
                .timestamp(System.currentTimeMillis())
                .build();
    }
}
