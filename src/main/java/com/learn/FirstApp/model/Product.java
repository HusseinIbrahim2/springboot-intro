package com.learn.FirstApp.model;
import jakarta.persistence.GeneratedValue;

public class Product {
    @GeneratedValue Long id;
    private String name;
    private String description;
    private Double price;

    Product() {}

    Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {return this.id;}
    public String getName() {return this.name;}
    public String getDescription() {return this.description;}
    public Double getPrice() {
        return this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
