package com.pws.springbootrestapiexceptionhandling.service;

import com.pws.springbootrestapiexceptionhandling.entity.Product;

public interface ProductService {
    public Product findProductById(Integer pid);
}
