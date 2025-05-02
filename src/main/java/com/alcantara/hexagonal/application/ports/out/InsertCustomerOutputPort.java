package com.alcantara.hexagonal.application.ports.out;

import com.alcantara.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
