package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfileController {

    @GetMapping("/cart")
    public String cartPage() {
        return "/cart";
    }

    @GetMapping("/signin")
    public String signinPage() {
        return "/signin";
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "/signup";
    }

}
