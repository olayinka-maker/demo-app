package com.springbootpractice.demo_app.service;

import com.springbootpractice.demo_app.model.Product;

import java.util.List;

public interface IProductService {


    Product addProduct(Product product);
    Product updateProduct(Product product, Long id);
    void deleteProduct(Long id);
    Product getProductById(Long id);
    List<Product> getProducts();

}
