package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoPageController {

    @GetMapping("/about")
    public String aboutPage() {
        return "/about";
    }

    @GetMapping("/faq")
    public String faqPage() {
        return "/faq";
    }

    @GetMapping("/contacts")
    public String contactsPage() {
        return "/contacts";
    }

}
