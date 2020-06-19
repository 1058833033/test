package com.qf.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenJie
 * @date 2020-06-18 15:29:34
 * 功能说明
 */
@RestController
public class Controller {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "明星星儿&&" + name;
    }
}
