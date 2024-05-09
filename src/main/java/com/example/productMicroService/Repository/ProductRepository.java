package com.example.productMicroService.Repository;

import com.example.productMicroService.Entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity,Integer> {
}
