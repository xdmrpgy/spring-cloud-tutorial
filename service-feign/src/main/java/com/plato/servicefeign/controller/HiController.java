package com.plato.servicefeign.controller;

import com.plato.servicebusiness.model.Employee;
import com.plato.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by Roy Pan
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping("/hi")
    public String hi(){
        return schedualServiceHi.sayHi();
    }
    @GetMapping("/getFirstEmployee")
    public Employee getEmployeeByEmpId(String empId){
        return schedualServiceHi.getEmployeeByEmpId(empId);
    }
    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee){
        return schedualServiceHi.addEmployee(employee);
    }
    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return schedualServiceHi.getAllEmployee();
    }
}
