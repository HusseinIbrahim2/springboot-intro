package com.learn.FirstApp.repository;

import com.learn.FirstApp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository{
    private List<Product> list = new ArrayList<Product>();

    public List<Product> findAll()
    {
        return list;
    }
    public Product getProductById(Long id)
    {
        return list.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}


