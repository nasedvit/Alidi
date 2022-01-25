package com.irlix.alidi.controllers.basket;

import com.irlix.alidi.domain.basket.Basket;
import com.irlix.alidi.domain.basket.CalculatedBasket;
import com.irlix.alidi.services.PriceCalculator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/basket")
public class BasketController {
    private final PriceCalculator priceCalculator;

    @GetMapping("/calculate")
    public CalculatedBasket calculate(@RequestBody Basket basket) {
        return priceCalculator.calculate(basket);
    }
}
