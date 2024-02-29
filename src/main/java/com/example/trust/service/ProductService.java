package com.example.trust.service;

import com.example.trust.models.Product;
import com.example.trust.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> productList(){
        return productRepository.findAll();
    }
    public Product getById(Long id){
        return productRepository.findById(id).orElse(null);
    }
}
