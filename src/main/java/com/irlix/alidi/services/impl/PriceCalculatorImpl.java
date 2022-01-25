package com.irlix.alidi.services.impl;

import com.irlix.alidi.domain.basket.Basket;
import com.irlix.alidi.domain.basket.CalculatedBasket;
import com.irlix.alidi.domain.product.CalculatedProduct;
import com.irlix.alidi.services.PriceCalculator;
import com.irlix.alidi.services.PriceInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PriceCalculatorImpl implements PriceCalculator {
    private final PriceInfo priceInfo;

    @Override
    public CalculatedBasket calculate(Basket basket) {
        List<CalculatedProduct> calculatedProducts = basket.getProducts().stream().map(product -> new CalculatedProduct(
                product.getId(),
                product.getNumberOfProducts(),
                priceInfo.getOrCreatePrice(product.getId()).multiply(new BigDecimal(product.getNumberOfProducts()))
        )).collect(Collectors.toList());

        return new CalculatedBasket(
                calculatedProducts,
                calculatedProducts.stream().map(CalculatedProduct::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add)
        );
    }
}
