package com.brutech.java_hibernate_advance_mappings.service;

import com.brutech.java_hibernate_advance_mappings.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    Customer save(Customer customer);
    Customer deleteById(Long id);

}
