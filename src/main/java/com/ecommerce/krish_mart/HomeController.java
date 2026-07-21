package com.ecommerce.krish_mart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "E-commerce app — iteration 0 is live.";
    }
}