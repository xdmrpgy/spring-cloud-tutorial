package com.plato.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping("/hi")
    String sayHi();

    @GetMapping("/getEmployeeByEmpId")
    String getEmployeeByEmpId(String empId);

    @PostMapping("/addEmployee")
    String addEmployee(String empId,String name);

    @GetMapping("/getAllEmployee")
    String getAllEmployee();
}
