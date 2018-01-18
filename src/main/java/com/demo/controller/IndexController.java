package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2018/1/18.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {
    @RequestMapping(value = {"/index", ""})
    public String index() {
        return "index";
    }
}
