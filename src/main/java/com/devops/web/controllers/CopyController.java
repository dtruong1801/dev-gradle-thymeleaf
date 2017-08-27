package com.devops.web.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dtruong1801 on 8/13/17.
 */
@Controller
public class CopyController {

    @RequestMapping("/about")
    public String about() {
        return "copy/about"; // about html file
    }
}
