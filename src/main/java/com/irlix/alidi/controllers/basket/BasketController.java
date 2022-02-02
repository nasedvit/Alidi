package com.irlix.alidi.controllers.basket;

import com.irlix.alidi.domain.inputDto.basket.Basket;
import com.irlix.alidi.domain.outputDto.basket.CalculatedBasket;
import com.irlix.alidi.services.IPriceCalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/basket")
public class BasketController {
    private final IPriceCalculatorService priceCalculatorService;

    @PostMapping("/calculate")
    @ResponseBody
    public CalculatedBasket calculate(@RequestBody @Valid Basket basket) {
        return priceCalculatorService.calculate(basket);
    }
}
