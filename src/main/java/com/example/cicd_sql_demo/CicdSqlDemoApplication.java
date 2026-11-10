package com.example.cicd_sql_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class CicdSqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdSqlDemoApplication.class, args);
	}

}
