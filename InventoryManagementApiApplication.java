package com.example.inventorymanagementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class InventoryManagementApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryManagementApiApplication.class, args);
    }
}

@RestController
class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Welcome to the Inventory Management API!";
    }
}

