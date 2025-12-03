package com.springbootpractice.demo_app.repository;

import com.springbootpractice.demo_app.model.Product;

import java.util.Arrays;
import java.util.List;

public interface ProductRepository {


    List<Product> productList =  Arrays.asList(
            new Product( 1L,"Samsung",100,"Samsung s20"),
            new Product( 2L,"IPhone",100,"Samsung s20"),
            new Product( 3L,"Pixel",100,"Samsung s20"),
            new Product( 4L,"Twitter",100,"Samsung s20")

    );

}
