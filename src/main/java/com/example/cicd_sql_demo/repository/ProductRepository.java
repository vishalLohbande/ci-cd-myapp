package com.example.cicd_sql_demo.repository;

import com.example.cicd_sql_demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
