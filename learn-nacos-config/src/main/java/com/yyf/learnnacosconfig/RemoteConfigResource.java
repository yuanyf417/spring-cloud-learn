package com.yyf.learnnacosconfig;

import com.yyf.learnnacosconfig.config.RemoteConfig;
import jakarta.annotation.Resource;
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
// 开启同步更新配置
@RefreshScope
public class RemoteConfigResource {

    @Value("${yyf.message.type}")
    private String type;

    // 这个配置方式不需要 @RefreshScope 也能实现自动刷新
    @Resource
    private RemoteConfig remoteConfig;

    @GetMapping("type")
    public String getType() {
        return String.format("Type: %s; Remote-Name: %s; Remote-Age: %s", type,
                remoteConfig.getName(), remoteConfig.getAge());
    }
}
