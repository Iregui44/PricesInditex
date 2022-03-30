package com.es.napptilus.prices.pricesrest.infrastructure.adapters.persistence.crud;

import com.es.napptilus.prices.pricesrest.infrastructure.adapters.persistence.entities.Price;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PriceCrudRepository extends CrudRepository<Price, Integer> {

    public List<Price> findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(Short brandId, Long productId, LocalDateTime startDate, LocalDateTime endDate);

}
