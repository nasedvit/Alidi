package com.irlix.alidi.controllers.fake;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/price-service")
@RequiredArgsConstructor
public class FakePrice {

    @GetMapping("/price/{productId}")
    public BigDecimal fakePrice(@PathVariable("productId") Long productId) {
        return BigDecimal.TEN;
    }
}
