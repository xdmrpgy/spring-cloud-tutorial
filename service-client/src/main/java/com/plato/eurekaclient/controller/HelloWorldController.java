package com.plato.eurekaclient.controller;

import com.plato.eurekaclient.service.EmployeeService;
import com.plato.servicebusiness.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    //此处参数需加@RequestBody，其他服务调用方通过postForObject或postForEntity方法才能传参过来
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
         employeeService.addEmployee(employee);
         return "success";
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        return  employeeService.getAllEmployee();
    }
}
