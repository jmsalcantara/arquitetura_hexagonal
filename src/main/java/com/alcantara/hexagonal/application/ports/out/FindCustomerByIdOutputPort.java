package com.alcantara.hexagonal.application.ports.out;

import com.alcantara.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
