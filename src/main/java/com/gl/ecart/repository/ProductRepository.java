package com.gl.ecart.repository;

import com.gl.ecart.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    List<Product> productList = new ArrayList<>();
    public Product getProduct(){
        Product product = new Product("Cycle",10);
        return product;
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public List<Product> getAllProduct() {
        return productList;
    }
}
