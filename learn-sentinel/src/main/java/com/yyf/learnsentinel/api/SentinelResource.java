package com.yyf.learnsentinel.api;

import com.yyf.learnsentinel.service.SentinelService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author YYF 2024/10/07 2024/10/7.
 */
@RestController
@RequestMapping("sentinel")
public class SentinelResource {

    @Resource
    public SentinelService sentinelService;

    @GetMapping("hello")
    public String query() {
        return sentinelService.query();
    }

    @GetMapping("save")
    public String save() {
        sentinelService.query();
        return sentinelService.save();
    }
}
