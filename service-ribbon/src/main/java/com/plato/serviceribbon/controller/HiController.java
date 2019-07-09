package com.plato.serviceribbon.controller;

import com.plato.serviceribbon.service.HiService;
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
    HiService hiService;

    @GetMapping("/hi")
    public String hi(){
        return hiService.callHi();
    }

    @GetMapping("/getEmployeeByEmpId")
    public String getEmployeeByEmpId(String empId){
        return hiService.callGetEmployeeByEmpId(empId);
    }

    @PostMapping("/addEmployee")
    public String addEmployee(String empId,String name){
        return hiService.callGetAddEmployee(empId,name);
    }

    @GetMapping("/getAllEmployee")
    public String getAllEmployee(){
        return hiService.callGetAllEmployee();
    }
}
