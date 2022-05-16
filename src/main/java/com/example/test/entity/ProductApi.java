package com.example.test.entity;

import com.example.test.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductApi {

    @Autowired
    ProductRepository productRepository;


    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Product save(@RequestBody Product product){
        productRepository.save(product);
        return product;
    }
}
