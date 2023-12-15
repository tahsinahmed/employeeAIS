package com.tahsin.employee.dao;

import com.tahsin.employee.enums.AddressType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDao {
    private String street;
    private String city;
    private String state;
    private AddressType addressType;
}
