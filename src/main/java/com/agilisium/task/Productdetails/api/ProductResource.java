package com.agilisium.task.Productdetails.api;

import com.agilisium.task.Productdetails.model.Dbconfig;
import com.agilisium.task.Productdetails.model.Product;
import com.agilisium.task.Productdetails.service.Productservice;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductResource {
    @Autowired
    Productservice productservice;
    @GetMapping("/api/getproductdetails")
    public  ResponseEntity<List<Product>> getPrd() {
        List<Product> productList =productservice.getProductList();
        return  ResponseEntity.status(HttpStatus.OK).body(productList);
    }
    @Value("${spring.datasource.url}")
    private String dataSourceURL;
    @Value("${spring.datasource.username}")
    private String dbUserName;
    @Value("${spring.datasource.password}")
    private String dbPassword;
    @Value("${spring.datasource.driver-class-name}")
    private String dbDriver;
    @GetMapping("/api/getconfigdetails")
    public ResponseEntity<Dbconfig> getDbadmin(Authentication authentication) {
        return  ResponseEntity.status(HttpStatus.OK).body(new Dbconfig( dataSourceURL,  dbUserName,  dbPassword,  dbDriver));
    }

}
