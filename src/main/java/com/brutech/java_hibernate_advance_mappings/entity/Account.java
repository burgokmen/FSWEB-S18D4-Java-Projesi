package com.brutech.java_hibernate_advance_mappings.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "account", schema = "fsweb")

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "money_amount")
    private double money_amount;

    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;

}
