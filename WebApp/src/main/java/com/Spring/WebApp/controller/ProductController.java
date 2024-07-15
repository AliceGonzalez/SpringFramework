package com.Spring.WebApp.controller;
//This class is responsible to accepts request for product

import com.Spring.WebApp.model.Product;
import com.Spring.WebApp.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    //This should return all products in the database
    public List<Product> getProducts(){
        //Need class that represents the product
        return service.getProducts();
    }
}
