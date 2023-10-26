package com.brutech.java_hibernate_advance_mappings.dao;

import com.brutech.java_hibernate_advance_mappings.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
