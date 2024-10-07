package com.yyf.learnsentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author YYF 2024/10/07 2024/10/7.
 */
@Service
public class SentinelService {

    @SentinelResource("save")
    public String save() {
        System.out.println("sentinel save success");
        return "sentinel save success";
    }

    @SentinelResource("query")
    public String query() {
        System.out.println("sentinel query success");
        return "sentinel query success";
    }

}
