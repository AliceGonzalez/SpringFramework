package com.Spring.WebApp.service;

import com.Spring.WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(new Product(321, "Samsung", 1500),
            new Product(34, "Video Camera", 8750),
            new Product(735,"Iphone", 9530));

    //METHOD-will return list of products
    public List<Product> getProducts(){
        return products;
    }
}
