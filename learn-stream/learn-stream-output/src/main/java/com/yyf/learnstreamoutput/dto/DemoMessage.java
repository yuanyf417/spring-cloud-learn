package com.yyf.learnstreamoutput.dto;

import lombok.Builder;
import lombok.Data;

/**
 * description
 *
 * @author YYF 2024/10/22 2024/10/22.
 */
@Data
@Builder
public class DemoMessage {

    private long messageId;
    private String message;
    private long timestamp;
}
