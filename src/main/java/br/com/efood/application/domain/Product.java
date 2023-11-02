package br.com.efood.application.domain;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Product {

    private String name;

    private Category category;

    private String description;

    private BigDecimal price;


    public Product(String name, Category category, String description, BigDecimal price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }
}
