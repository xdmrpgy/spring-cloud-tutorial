package com.plato.serviceclient.service;

import com.plato.serviceclient.dao.EmployeeDao;
import com.plato.servicebusiness.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by Roy Pan
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public Employee getEmployeeByEmpId(String empId){
        return employeeDao.getEmployeeByEmpId(empId);
    }

    public void addEmployee(Employee employee){employeeDao.addEmployee(employee);}

    public List<Employee> getAllEmployee(){
        return employeeDao.getAllEmployee();
    }
}
