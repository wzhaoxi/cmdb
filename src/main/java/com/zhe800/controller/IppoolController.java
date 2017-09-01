package com.zhe800.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IppoolController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String show(){
        System.out.println("======================>");


        return "index";

    }
}
