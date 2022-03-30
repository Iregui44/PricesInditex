package com.es.napptilus.prices.pricesrest.domain.repositories;

import com.es.napptilus.prices.pricesrest.domain.models.Price;

import java.time.LocalDateTime;
import java.util.Optional;

public interface IPriceRepository {

    public Optional<Price> getProductByDate(LocalDateTime applicationDate, Long idProduct, Short brandId);
}
