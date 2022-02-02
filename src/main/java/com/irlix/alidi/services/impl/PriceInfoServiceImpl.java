package com.irlix.alidi.services.impl;

import com.irlix.alidi.domain.inputDto.product.Product;
import com.irlix.alidi.domain.outputDto.product.CalculatedProduct;
import com.irlix.alidi.exceptions.RestException;
import com.irlix.alidi.services.IPriceInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class PriceInfoServiceImpl implements IPriceInfoService {
    private final HttpHeaders headers;
    private final RestTemplate restTemplate;

    @Override
    @Cacheable(cacheNames = "priceCache", key = "#product.id")
    public CalculatedProduct getOrCreatePrice(Product product) {
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Product> requestEntity = new HttpEntity<>(product, headers);
        CalculatedProduct calculatedProduct;
        try {
            calculatedProduct = restTemplate
                    .postForEntity(
                            "http://localhost:8080/price-service/price",
                            requestEntity,
                            CalculatedProduct.class
                    ).getBody();
        } catch (RuntimeException e) {
            throw new RestException("Service did not send a response");
        }
        return calculatedProduct;
    }
}
