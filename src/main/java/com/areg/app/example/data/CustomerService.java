package com.areg.app.example.data;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@AllArgsConstructor
@Service

public class CustomerService {

    private final CustomerRepository customerRepository;

    @Transactional
    public long deleteByFirstName (String firstName) {
        return customerRepository.deleteByFirstName(firstName);

    }


}
