package com.jibril.productService.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table( name = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
