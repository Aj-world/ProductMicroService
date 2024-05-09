package com.example.productMicroService.Service;


import com.example.productMicroService.Entity.ProductEntity;
import com.example.productMicroService.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

 @Autowired
 private ProductRepository productRepository;

 public void saveProduct(ProductEntity product) {

    productRepository.save(product);
 }

 public ProductEntity getProductById(Integer productId) {
  return productRepository.findById(productId).orElse(null);
 }
 }
