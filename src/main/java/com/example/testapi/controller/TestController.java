package com.example.testapi.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.testapi.entity.Product;
import com.example.testapi.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class TestController {
	
	
	private final ProductService productService;

    public TestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        // Use ProductService to fetch all products
        return productService.getAllProducts();
    }
}
