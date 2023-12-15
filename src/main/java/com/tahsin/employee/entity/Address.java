package com.tahsin.employee.entity;

import com.tahsin.employee.enums.AddressType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@Setter
@Getter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
