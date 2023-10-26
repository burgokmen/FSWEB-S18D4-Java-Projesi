package com.brutech.java_hibernate_advance_mappings.service;

import com.brutech.java_hibernate_advance_mappings.dao.CustomerRepository;
import com.brutech.java_hibernate_advance_mappings.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @GetMapping("/")
    @Override
    public List<Customer> findAll() {
            return customerRepository.findAll();
    }
    @GetMapping("/{id}")
    @Override
    public Customer findById(@PathVariable Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Customer save(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @DeleteMapping("/{id}")
    @Override
    public Customer deleteById(@PathVariable Long id) {
        Customer c = new Customer();
        return c;
    }
}
