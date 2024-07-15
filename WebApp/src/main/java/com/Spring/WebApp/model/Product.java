package com.Spring.WebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //Indicates this class is for data and allows to get this data
@AllArgsConstructor //Creates constructor
public class Product {

    private int productId;
    private  String productName;
    private int productPrice;

}
