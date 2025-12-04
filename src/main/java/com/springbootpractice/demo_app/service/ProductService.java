package com.springbootpractice.demo_app.service;

import com.springbootpractice.demo_app.model.Product;
import com.springbootpractice.demo_app.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;



@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

   private final ProductRepository productRepository;

//    List<Product> products = Arrays.asList(
//            new Product(null,"Samsung",100,"Samsung s20"),
//            new Product(null,"IPhone",100,"Iphone 14"),
//            new Product(null,"Pixel",100,"Pixel 7"),
//            new Product(null,"Twitter",100,"Twitter Phone")
//    );


    @Override
    public Product addProduct(Product product) {
        return null;
    }



    @Override
    public Product updateProduct(Product product,Long id) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }



    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
