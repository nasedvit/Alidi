package com.irlix.alidi.services.impl;

import com.irlix.alidi.domain.inputDto.basket.Basket;
import com.irlix.alidi.domain.outputDto.basket.CalculatedBasket;
import com.irlix.alidi.domain.outputDto.product.CalculatedProduct;
import com.irlix.alidi.services.IPriceCalculatorService;
import com.irlix.alidi.services.IPriceInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PriceCalculatorServiceImpl implements IPriceCalculatorService {
    private final IPriceInfoService priceInfoService;

    @Override
    public CalculatedBasket calculate(Basket basket) {
        List<CalculatedProduct> calculatedProducts = basket.getProducts().stream()
                .map(priceInfoService::getOrCreatePrice)
                .collect(Collectors.toList());

        return new CalculatedBasket(
                calculatedProducts,
                calculatedProducts.stream()
                        .map(CalculatedProduct::getPrice)
                        .reduce(BigDecimal.ZERO, BigDecimal::add)
        );
    }
}
