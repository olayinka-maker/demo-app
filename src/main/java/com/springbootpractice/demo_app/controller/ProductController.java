package com.springbootpractice.demo_app.controller;


import com.springbootpractice.demo_app.model.Product;
import com.springbootpractice.demo_app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController{

    private final ProductService productService;

      @GetMapping("/all")
      public List all(){
         return  productService.getProductList();
    }

}
