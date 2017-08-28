package com.devops.web.controllers;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marsdev on 8/28/17.
 */
@Controller
public class PayloadController {

    /** The payload view */
    public static final String PAYLOAD_VIEW_NAME = "payload/payload";

    @RequestMapping("/payload")
    public String payload() {
        return PAYLOAD_VIEW_NAME;
    }
}
