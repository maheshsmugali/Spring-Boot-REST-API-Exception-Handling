package com.pws.springbootrestapiexceptionhandling.controller;

import com.pws.springbootrestapiexceptionhandling.entity.Product;
import com.pws.springbootrestapiexceptionhandling.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping(value = "/getProduct",produces = {"application/json"})
    public Product getProductDataById(@RequestParam("pid") String pid){
        return productService.findProductById(Integer.parseInt( pid));
    }
}
