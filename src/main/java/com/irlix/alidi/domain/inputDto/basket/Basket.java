package com.irlix.alidi.domain.inputDto.basket;

import com.irlix.alidi.domain.inputDto.product.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Component
public class Basket {
    @Valid @NotNull
    private List<Product> products;
    @NotNull
    private PaymentTypeEnum paymentTypeEnum;
    @Nullable
    private Long addressId;
}
