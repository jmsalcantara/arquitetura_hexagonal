package com.alcantara.hexagonal.application.ports.in;

import com.alcantara.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
