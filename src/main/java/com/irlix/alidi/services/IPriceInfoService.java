package com.irlix.alidi.services;

import com.irlix.alidi.domain.inputDto.product.Product;
import com.irlix.alidi.domain.outputDto.product.CalculatedProduct;

public interface IPriceInfoService {
    CalculatedProduct getOrCreatePrice(Product product);
}
