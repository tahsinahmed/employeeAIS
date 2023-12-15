package com.tahsin.employee.repository;

import com.tahsin.employee.entity.Address;
import com.tahsin.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {
}
