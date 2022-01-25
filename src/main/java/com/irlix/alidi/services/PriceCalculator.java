package com.irlix.alidi.services;

import com.irlix.alidi.domain.basket.Basket;
import com.irlix.alidi.domain.basket.CalculatedBasket;

public interface PriceCalculator {
    CalculatedBasket calculate(Basket basket);
}
