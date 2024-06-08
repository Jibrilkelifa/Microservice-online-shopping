package com.jibril.productService.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table( name ="ProductRequests")
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
