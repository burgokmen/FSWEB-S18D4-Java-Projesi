package com.brutech.java_hibernate_advance_mappings.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "address", schema = "fsweb")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "street")
    private String street;

    @Column(name = "no")
    private int no;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "description")
    private String description;

    @OneToOne(cascade = {CascadeType.ALL},mappedBy = "address")
    private Customer customer;

}
