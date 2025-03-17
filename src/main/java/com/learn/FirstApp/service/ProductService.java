package com.learn.FirstApp.service;

import com.learn.FirstApp.model.Product;
import com.learn.FirstApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll()
    {
        return productRepository.findAll();
    }
    public Product getProductById(Long id)
    {
        return productRepository.getProductById(id);
    }
    public void deleteProduct(Long id)
    {
        productRepository.deleteProduct(id);
    }

    public void updateProduct(Product p)
    {
        productRepository.updateProduct(p);
    }

    public void addProduct(Product product)
    {
        productRepository.addProduct(product);
    }
}
