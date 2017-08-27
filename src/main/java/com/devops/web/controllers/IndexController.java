package com.devops.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dtruong1801 on 8/11/17.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
