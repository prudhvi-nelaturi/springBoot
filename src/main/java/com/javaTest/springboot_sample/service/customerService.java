package com.javaTest.springboot_sample.service;

import com.javaTest.springboot_sample.dto.customerDTO;

public interface customerService {

    long createCustomer(customerDTO customerDTO);
//    boolean existsByEmail(String email);
    customerDTO updateCustomer(long id, customerDTO customerDTO);
    String statusToggle(long id, String status);
}
