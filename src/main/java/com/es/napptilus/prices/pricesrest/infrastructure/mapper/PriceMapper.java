package com.es.napptilus.prices.pricesrest.infrastructure.mapper;

import com.es.napptilus.prices.pricesrest.infrastructure.adapters.persistence.entities.Price;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    public com.es.napptilus.prices.pricesrest.domain.models.Price toPriceDomain(Price price);

}
