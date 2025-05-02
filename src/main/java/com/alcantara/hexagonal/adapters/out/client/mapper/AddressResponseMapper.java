package com.alcantara.hexagonal.adapters.out.client.mapper;

import com.alcantara.hexagonal.adapters.out.client.response.AddressResponse;
import com.alcantara.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
