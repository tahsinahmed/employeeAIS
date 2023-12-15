package com.tahsin.employee.service;

import com.tahsin.employee.dao.EmployeeDao;
import com.tahsin.employee.entity.Employee;
import com.tahsin.employee.enums.State;
import com.tahsin.employee.repository.AddressRepo;
import com.tahsin.employee.repository.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final ModelMapper modelMapper;
    private final AddressRepo addressRepo;

    public List<EmployeeDao> getAll() {
        return employeeRepo.findAll().stream()
                .map(employee -> modelMapper.map(employee, EmployeeDao.class)).collect(Collectors.toList());
    }

    public String save(EmployeeDao employeeDao) {
        try {
            employeeRepo.save(modelMapper.map(employeeDao, Employee.class));
            return "Employee Saved Successfully !!";
        } catch (Exception exception) {
            return "AN Internal Server Error has Occurred";
        }
    }

    //name done
    //partial name done
    //state

    public List<Employee> searchByName(String name) {
        return employeeRepo.getByPartialName(name);
    }

    public List<Employee> findByState(String state) {
        return employeeRepo.findByState(State.valueOf(state));
    }
}
