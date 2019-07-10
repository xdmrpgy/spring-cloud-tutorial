package com.plato.servicefeign.service;

import com.plato.servicebusiness.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

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
    public Employee getEmployeeByEmpId(String empId) {
        return null;
    }

    @Override
    public String addEmployee(Employee employee) {
        return "sorry,505";
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }
}
