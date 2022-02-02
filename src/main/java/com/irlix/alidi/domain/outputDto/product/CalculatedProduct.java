package com.irlix.alidi.domain.outputDto.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CalculatedProduct {
    private Long id;
    private Integer numberOfProducts;
    private BigDecimal price;
}


