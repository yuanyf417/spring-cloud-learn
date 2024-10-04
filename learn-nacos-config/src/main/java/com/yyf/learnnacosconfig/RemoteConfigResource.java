package com.yyf.learnnacosconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author YYF 2024/10/04 2024/10/4.
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class RemoteConfigResource {

    @Value("${yyf.message.type}")
    private String type;

    @GetMapping("type")
    public String getType() {
        return type;
    }
}
