package com.bezkoder.spring.security.login.controllers;

import com.bezkoder.spring.security.login.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test2")
public class TestController2 {

    List<Product> products = List.of(new Product("product 1"), new Product("product 2"));

    @GetMapping("/products")
    public ResponseEntity<List<Product>> allAccess() {
        return ResponseEntity.ok().body(products);
    }



}