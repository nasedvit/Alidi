package com.irlix.alidi.domain.outputDto.basket;

import com.irlix.alidi.domain.outputDto.product.CalculatedProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CalculatedBasket {
    private List<CalculatedProduct> calculatedProducts;
    private BigDecimal totalPrice;
}
