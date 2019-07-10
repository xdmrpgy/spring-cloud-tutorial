package com.plato.serviceribbon.controller;

import com.plato.servicebusiness.model.Employee;
import com.plato.serviceribbon.service.HiService;
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
    HiService hiService;

    @GetMapping("/hi")
    public String hi(){
        return hiService.callHi();
    }

    @GetMapping("/getEmployeeByEmpId")
    public Employee getEmployeeByEmpId(String empId){
        return hiService.callGetEmployeeByEmpId(empId);
    }

    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee){
        return hiService.callAddEmployee(employee);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return hiService.callGetAllEmployee();
    }
}
