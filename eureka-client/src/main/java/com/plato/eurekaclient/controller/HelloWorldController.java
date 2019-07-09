package com.plato.eurekaclient.controller;

import com.plato.eurekaclient.model.Employee;
import com.plato.eurekaclient.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by Roy Pan
 */
@RestController
public class HelloWorldController {
    @Value("${server.port}")
    String port;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/hi")
    public String sayHi(){
        return "hi:" + port;
    }

    @GetMapping("/getEmployeeByEmpId")
    public Employee getEmployeeByEmpId(String empId) {
        return  employeeService.getEmployeeByEmpId(empId);
    }

    @PostMapping("/addEmployee")
    public String addEmployee(String empId,String name) {
         employeeService.addOne(empId,name);
         return "success";
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        return  employeeService.getAll();
    }
}
