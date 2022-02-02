package com.irlix.alidi.domain.inputDto.product;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;

@Getter
@Setter
public class Product {
    private Long id;
    @Min(1)
    private Integer numberOfProducts;
}
