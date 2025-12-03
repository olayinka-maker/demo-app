package com.springbootpractice.demo_app.service;

import com.springbootpractice.demo_app.model.Product;
import com.springbootpractice.demo_app.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;



@Service
public class ProductService {

    public List<Product> getProductList(){
        return ProductRepository.productList;
    }
}
