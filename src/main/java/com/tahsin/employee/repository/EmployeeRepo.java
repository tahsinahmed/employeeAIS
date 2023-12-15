package com.tahsin.employee.repository;

import com.tahsin.employee.entity.Employee;
import com.tahsin.employee.enums.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Query(value = "select * from employee where name like :name || '%'", nativeQuery = true)
    List<Employee>  getByPartialName(@Param("name") String name);

    List<Employee> findByState(State state);
}
