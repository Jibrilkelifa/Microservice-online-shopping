package com.jibril.productService.controller;

import com.jibril.productService.dto.ProductRequest;
import com.jibril.productService.dto.ProductResponse;
import com.jibril.productService.model.Product;
import com.jibril.productService.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  void createProduct( @RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllproducts(){
        return productService.getAllProducts();

    }

}
