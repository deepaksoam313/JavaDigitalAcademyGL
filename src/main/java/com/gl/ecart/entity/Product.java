package com.gl.ecart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Product {
    private String name;
    private int id;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
