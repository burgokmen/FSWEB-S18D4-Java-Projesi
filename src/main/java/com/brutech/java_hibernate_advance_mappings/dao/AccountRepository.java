package com.brutech.java_hibernate_advance_mappings.dao;

import com.brutech.java_hibernate_advance_mappings.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
