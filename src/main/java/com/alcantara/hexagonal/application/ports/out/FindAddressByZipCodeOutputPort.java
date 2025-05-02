package com.alcantara.hexagonal.application.ports.out;

import com.alcantara.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCoce);
}
