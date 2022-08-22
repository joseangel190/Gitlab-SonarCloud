package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    List<Product> findAll(){
        return productRepository.findAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        productRepository.deleteById(id);
    }
}
