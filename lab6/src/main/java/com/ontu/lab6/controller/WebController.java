package com.ontu.lab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("var0", "X");
        model.addAttribute("var1", "X");
        model.addAttribute("var2", "X");
        model.addAttribute("var3", "");
        model.addAttribute("var4", "O");
        model.addAttribute("var5", "");
        model.addAttribute("var6", "O");
        model.addAttribute("var7", "");
        model.addAttribute("var8", "O");
        return "index";
    }
}