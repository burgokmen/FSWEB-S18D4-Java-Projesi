package com.brutech.java_hibernate_advance_mappings.dao;

import com.brutech.java_hibernate_advance_mappings.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
