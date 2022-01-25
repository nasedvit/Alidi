package com.irlix.alidi.domain.basket;

import com.irlix.alidi.domain.product.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import java.util.List;

@Getter
@Setter
public class Basket {

    private List<Product> products;
    private PaymentType paymentType;

    @Nullable
    private Long addressId;
}
