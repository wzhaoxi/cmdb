package com.zhe800.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping("/tiger")
    public @ResponseBody String test() {
        return "hello, world! This com from spring!";
    }
}
