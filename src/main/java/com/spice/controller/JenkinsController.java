package com.spice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author spice
 * @date 2023/3/20
 */
@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    @GetMapping("/msg")
    public String getMsg() {
        return "Hello, jenkins.";
    }
}
