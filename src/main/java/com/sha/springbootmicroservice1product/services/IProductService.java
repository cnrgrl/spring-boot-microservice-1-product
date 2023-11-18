package com.sha.springbootmicroservice1product.services;

import com.sha.springbootmicroservice1product.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProduct();
}
