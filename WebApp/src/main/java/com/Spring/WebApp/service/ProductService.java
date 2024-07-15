package com.Spring.WebApp.service;

import com.Spring.WebApp.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {
    List<Product> products = Arrays.asList(new Product(321, "Samsung", 1500),
            new Product(34, "Video Camera", 8750));

    //METHOD-will return list of products
    public List<Product> getProducts(){
        return null;
    }
}
