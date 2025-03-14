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
}


