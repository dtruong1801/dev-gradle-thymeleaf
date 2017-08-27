package com.devops.web.constrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dtruong1801 on 8/26/17.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
