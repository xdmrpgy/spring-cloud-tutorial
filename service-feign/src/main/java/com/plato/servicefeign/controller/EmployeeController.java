package com.plato.servicefeign.controller;

import com.plato.servicebusiness.model.Employee;
import com.plato.servicefeign.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by Roy Pan
 */
@RestController
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;
    @GetMapping("/hi")
    public String hi(){
        return employeeService.sayHi();
    }

    @GetMapping("/getEmployeeByEmpId")
    public Employee getEmployeeByEmpId(String empId){
        return employeeService.getEmployeeByEmpId(empId);
    }

    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
}
