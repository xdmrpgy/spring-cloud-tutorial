package com.plato.serviceribbon.controller;

import com.plato.servicebusiness.model.Employee;
import com.plato.serviceribbon.service.EmployeeService;
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
    EmployeeService employeeService;

    @GetMapping("/hi")
    public String hi(){
        return employeeService.callHi();
    }

    @GetMapping("/getEmployeeByEmpId")
    public Employee getEmployeeByEmpId(String empId){
        return employeeService.callGetEmployeeByEmpId(empId);
    }

    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee){
        return employeeService.callAddEmployee(employee);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.callGetAllEmployee();
    }
}
