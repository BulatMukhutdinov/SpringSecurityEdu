package ru.bulatmukhutdinov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping(value = {"/", "/home"})
    public String index() {
        return "home";
    }

    @RequestMapping(value = {"/hello"})
    public String hello() {
        return "hello";
    }
}
