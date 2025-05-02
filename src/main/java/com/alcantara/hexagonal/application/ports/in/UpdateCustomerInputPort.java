package com.alcantara.hexagonal.application.ports.in;

import com.alcantara.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
