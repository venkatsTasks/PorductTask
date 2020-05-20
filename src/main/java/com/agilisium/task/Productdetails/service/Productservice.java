package com.agilisium.task.Productdetails.service;

import com.agilisium.task.Productdetails.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class Productservice {

    private List<Product> productList=new ArrayList<>(Arrays.asList(
         new Product(123,"Chairs",100,500),
            new Product(124,"Tables",150,1500),
            new Product(125,"Computers",10,50000)
        ));
     public List<Product> getProductList(){
         return productList;
     }
}
