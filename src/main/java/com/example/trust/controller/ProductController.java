package com.example.trust.controller;

import com.example.trust.service.ProductService;
import jakarta.persistence.Column;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/")
    public String getProducts(Model model){
        model.addAttribute("products", productService.productList());
        return "main";
    }
    @GetMapping("/{id}")
    public String getByIdProduct(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "product-info";
    }
}
