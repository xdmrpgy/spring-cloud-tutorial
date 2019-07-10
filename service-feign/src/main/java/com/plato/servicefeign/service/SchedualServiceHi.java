package com.plato.servicefeign.service;

import com.plato.servicebusiness.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping("/hi")
    String sayHi();

    @GetMapping("/getEmployeeByEmpId")
    Employee getEmployeeByEmpId(String empId);

    @PostMapping("/addEmployee")
    String addEmployee(Employee employee);

    @GetMapping("/getAllEmployee")
    List<Employee> getAllEmployee();
}
