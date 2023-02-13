package com.pws.springbootrestapiexceptionhandling.service;

import com.pws.springbootrestapiexceptionhandling.entity.Product;
import com.pws.springbootrestapiexceptionhandling.exceptions.NoProductFoundException;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product findProductById(Integer pid) {
        if (pid == 101) {
            return new Product("101", "EarPhone", 1599.0);
        } else {
            throw new NoProductFoundException("No Product Found");
        }
    }
}