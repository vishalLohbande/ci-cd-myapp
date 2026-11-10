package com.example.cicd_sql_demo.service;

import com.example.cicd_sql_demo.entity.Product;
import com.example.cicd_sql_demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(Product productReq){
        Product productRes = productRepository.save(productReq);
        return productRes;
    }

}
