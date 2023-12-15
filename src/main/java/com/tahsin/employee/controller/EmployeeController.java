package com.tahsin.employee.controller;

import com.tahsin.employee.dao.EmployeeDao;
import com.tahsin.employee.enums.State;
import com.tahsin.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().body(employeeService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody EmployeeDao employeeDao) {
        return ResponseEntity.ok().body(employeeService.save(employeeDao));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> getByName(@PathVariable("name") String name) {
        return ResponseEntity.ok().body(employeeService.searchByName(name));
    }

    @GetMapping("/state/{state}")
    public ResponseEntity<?> getByState(@PathVariable("state") String state) {
        return ResponseEntity.ok().body(employeeService.findByState(state));
    }
}
