package com.irlix.alidi.services;

import java.math.BigDecimal;

public interface PriceInfo {
    BigDecimal getOrCreatePrice(Long productId);
}
