package com.example.showcase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {
    @GetMapping("/")
    String getProducts() {
        return "products";
    }
}
