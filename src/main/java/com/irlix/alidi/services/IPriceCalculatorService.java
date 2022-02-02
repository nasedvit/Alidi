package com.irlix.alidi.services;

import com.irlix.alidi.domain.inputDto.basket.Basket;
import com.irlix.alidi.domain.outputDto.basket.CalculatedBasket;

public interface IPriceCalculatorService {
    CalculatedBasket calculate(Basket basket);
}
