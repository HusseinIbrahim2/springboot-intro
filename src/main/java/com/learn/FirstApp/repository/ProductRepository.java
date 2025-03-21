package com.learn.FirstApp.repository;

import com.learn.FirstApp.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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
    public void deleteProduct(Long id)
    {
        list.removeIf(product -> product.getId().equals(id));
    }
    public void updateProduct(Product p)
    {
        list.stream()
                .filter(product -> product.getId().equals(p.getId()))
                .findFirst()
                .ifPresentOrElse(
                        product -> {
                            product.setId(p.getId());
                            product.setName(p.getName());
                            product.setPrice(p.getPrice());
                            product.setDescription(p.getDescription());
                        },
                        () -> { throw new RuntimeException("Product not found"); }
                );
    }
    public void addProduct(Product product)
    {
        list.add(product);
    }
}


