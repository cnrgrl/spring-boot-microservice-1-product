package com.sha.springbootmicroservice1product.controller;

import com.sha.springbootmicroservice1product.model.Product;
import com.sha.springbootmicroservice1product.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product") //pre-path
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping //api/product
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllProduct() {
        return ResponseEntity.ok(productService.findAllProduct());
    }
}
