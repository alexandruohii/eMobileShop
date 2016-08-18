package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Alx on 8/9/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout, Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid username and password");
        }
        if (logout != null) {
            model.addAttribute("logoutMessage", "You have been logged out successfully");
        }
        return "login";
    }

    @RequestMapping("/accessDenied")
    public String about() {
        return "accessDenied";
    }


}
