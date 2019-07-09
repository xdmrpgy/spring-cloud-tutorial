package com.plato.servicefeign.controller;

import com.plato.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String getEmployeeByEmpId(String empId){
        return schedualServiceHi.getEmployeeByEmpId(empId);
    }
    @PostMapping("/addEmployee")
    public String addEmployee(String empId,String name){
        return schedualServiceHi.addEmployee(empId,name);
    }
    @GetMapping("/getAllEmployee")
    public String getAllEmployee(){
        return schedualServiceHi.getAllEmployee();
    }
}
