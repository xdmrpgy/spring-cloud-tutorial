package com.plato.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author by Roy Pan
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHi() {
        return "sorry,505";
    }

    @Override
    public String getEmployeeByEmpId(String empId) {
        return "sorry,505";
    }

    @Override
    public String addEmployee(String empId,String name) {
        return "sorry,505";
    }

    @Override
    public String getAllEmployee() {
        return "sorry,505";
    }
}
