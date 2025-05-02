package com.alcantara.hexagonal.adapters.out.repository.mapper;

import com.alcantara.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.alcantara.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
