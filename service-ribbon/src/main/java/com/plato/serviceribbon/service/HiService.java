package com.plato.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @author by Roy Pan
 */
@Service
public class HiService {
    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "error")
    public String callHi(){
        return restTemplate.getForObject("http://eureka-client/hi",String.class);
    }

    public String error(){
        return "sorry,something is wrong!";
    }

    public String callGetEmployeeByEmpId(String empId){
        return restTemplate.getForObject("http://eureka-client/getEmployeeByEmpId?empId=" + empId,String.class);
    }

    public String callGetAddEmployee(String empId,String name){
        HashMap<String,String> map = new HashMap<>();
        map.put("empId",empId);
        map.put("name",name);
        return restTemplate.postForObject("http://eureka-client/addEmployee",map,String.class);
    }

    public String callGetAllEmployee(){
        return restTemplate.getForObject("http://eureka-client/getAllEmployee",String.class);
    }
}
