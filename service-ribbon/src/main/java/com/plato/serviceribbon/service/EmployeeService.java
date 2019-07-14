package com.plato.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.plato.servicebusiness.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

/**
 * @author by Roy Pan
 */
@Service
public class EmployeeService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String callHi(){
        return restTemplate.getForObject("http://service-client/hi",String.class);
    }

    public String error(){
        return "sorry,something is wrong!";
    }

    public Employee callGetEmployeeByEmpId(String empId){
        return restTemplate.getForObject("http://service-client/getEmployeeByEmpId?empId=" + empId,Employee.class);
    }

    public String callAddEmployee(Employee employee){
        return restTemplate.postForObject("http://service-client/addEmployee",employee,String.class);
    }

    public String callAddEmployee2(Employee employee){
        return restTemplate.postForEntity("http://service-client/addEmployee",employee,String.class).getBody();
    }

    public List<Employee> callGetAllEmployee(){
        return restTemplate.getForObject("http://service-client/getAllEmployee",List.class);
    }
}
