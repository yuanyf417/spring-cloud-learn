package com.yyf.learngatewayprovider.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author YYF 2024/10/04 2024/10/4.
 */
@RestController
@RequestMapping("learn")
public class LearnApi {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

}
