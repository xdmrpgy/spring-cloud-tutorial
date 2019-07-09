package com.plato.eurekaclient.service;

import com.plato.eurekaclient.dao.EmployeeDao;
import com.plato.eurekaclient.model.Employee;
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

    public void addOne(String empId,String name){employeeDao.addOne(empId,name);}

    public List<Employee> getAll(){
        return employeeDao.getAll();
    }
}
