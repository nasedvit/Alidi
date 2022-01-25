package com.irlix.alidi.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PriceInfoImpl implements com.irlix.alidi.services.PriceInfo {
    private final RestTemplate restTemplate;

    @Override
    @Cacheable(cacheNames = "priceCache", key = "#productId")
    public BigDecimal getOrCreatePrice(Long productId) {
        return restTemplate
                .getForEntity("http://localhost:8080/price-service/price/{productId}", BigDecimal.class, productId)
                .getBody();
    }
}
