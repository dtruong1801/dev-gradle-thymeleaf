package com.devops.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dtruong1801 on 8/28/17.
 */
@Controller
public class LoginController {

    /** The login view */
    public static final String LOGIN_VIEW_NAME = "user/login";

    @RequestMapping("/login")
    public String login() {
        return LOGIN_VIEW_NAME;
    }
}
