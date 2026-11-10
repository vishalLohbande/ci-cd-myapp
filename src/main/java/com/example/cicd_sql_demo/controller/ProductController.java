package com.example.cicd_sql_demo.controller;

import com.example.cicd_sql_demo.entity.Product;
import com.example.cicd_sql_demo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product productReq){
        Product productResponse = productService.create(productReq);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(productResponse);
    }

}
