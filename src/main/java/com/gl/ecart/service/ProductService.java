package com.gl.ecart.service;

import com.gl.ecart.entity.Product;
import com.gl.ecart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product getProduct(){
        return productRepository.getProduct();
    }

    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }
}
