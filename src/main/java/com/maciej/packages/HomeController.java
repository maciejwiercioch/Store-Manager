package com.maciej.packages;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
