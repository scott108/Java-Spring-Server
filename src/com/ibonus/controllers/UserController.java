package com.ibonus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
	
	@RequestMapping("hello")
    public String hello(@RequestParam("user") String user, Model m) {
        m.addAttribute("user", user);
        return "hello";
    }
}
