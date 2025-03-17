package com.learn.FirstApp.controller;

import com.learn.FirstApp.model.Product;
import com.learn.FirstApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll()
    {
        return productService.findAll();
    }
    @GetMapping("{id}")
    public Product getProductById(Long id)
    {
        return productService.getProductById(id);
    }
    @DeleteMapping("{id}")
    public void deleteProduct(Long id)
    {
        productService.deleteProduct(id);
    }
    @PutMapping
    public void updateProduct(Product p)
    {
        productService.updateProduct(p);
    }
    @PostMapping
    public void addProduct(Product product)
    {
        productService.addProduct(product);
    }
}
