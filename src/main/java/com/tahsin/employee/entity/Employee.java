package com.tahsin.employee.entity;

import com.tahsin.employee.enums.State;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "employee")
@Setter
@Getter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String presentAddress;

    @Column
    private String permanentAddress;

    @Column
    @Enumerated(value = EnumType.STRING)
    private State state;
}
