/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: HelloController
 * Author:   laosun
 * Date:     2019/7/17 11:39 AM
 * Description:
 */
package com.zhiyou.springboot5freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("message", "yes, this is message.");
        return "index";
    }

}
