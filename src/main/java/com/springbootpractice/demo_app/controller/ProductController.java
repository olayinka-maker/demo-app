package com.springbootpractice.demo_app.controller;


import com.springbootpractice.demo_app.model.Product;
import com.springbootpractice.demo_app.service.IProductService;
import com.springbootpractice.demo_app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController{

    private final IProductService  productService;



    @GetMapping("/all")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{id}/productbyid")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }


    @PostMapping("/add")
    public Product addProduct(Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/update")
    public Product updateProduct(Product product,Long id) {
        return productService.updateProduct(product,id);
    }

    @DeleteMapping("/{id}/delete")
    public void  deleteProduct(@PathVariable  Long id) {

    }



}
