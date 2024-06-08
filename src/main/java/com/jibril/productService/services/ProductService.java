package com.jibril.productService.services;

import com.jibril.productService.dto.ProductRequest;
import com.jibril.productService.model.Product;
import com.jibril.productService.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private  final ProductRepository productRepository;



    public  void createProduct (ProductRequest productRequest ){
      Product product = Product.builder()
              .name(productRequest.getName())
              .description(productRequest.getDescription())
              .price(productRequest.getPrice())
              .build();
      productRepository.save(product);
      log.info("Product {} is saved ", product.getId());

    }
}
