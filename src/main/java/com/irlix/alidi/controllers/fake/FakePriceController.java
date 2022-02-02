package com.irlix.alidi.controllers.fake;

import com.irlix.alidi.domain.inputDto.product.Product;
import com.irlix.alidi.domain.outputDto.product.CalculatedProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/price-service")
@RequiredArgsConstructor
public class FakePriceController {

    @PostMapping("/price")
    public CalculatedProduct fakePrice(@RequestBody Product product) {
        return new CalculatedProduct(
                product.getId(),
                product.getNumberOfProducts(),
                BigDecimal.TEN
        );
    }
}
