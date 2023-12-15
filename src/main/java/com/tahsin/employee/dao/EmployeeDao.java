package com.tahsin.employee.dao;

import com.tahsin.employee.entity.Address;
import com.tahsin.employee.enums.State;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class EmployeeDao {

    private String name;
    private Integer age;
    private String presentAddress;
    private String permanentAddress;
    private State state;
}
