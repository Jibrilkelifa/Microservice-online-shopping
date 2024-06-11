package com.jibril.productService.services;

import com.jibril.productService.dto.ProductRequest;
import com.jibril.productService.dto.ProductResponse;
import com.jibril.productService.model.Product;
import com.jibril.productService.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }
    private  ProductResponse mapToProductResponse(Product product){
        return  ProductResponse.builder()
                .id(product.getId())
                .description(product.getDescription())
                .name(product.getName())
                .price(product.getPrice())
                .build();

    }
}
