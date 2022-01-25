package com.irlix.alidi.domain.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
public class CalculatedProduct {
    private Long id;
    private Integer numberOfProducts;
    private BigDecimal price;
}
