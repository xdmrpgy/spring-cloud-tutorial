package com.plato.eurekaclient.dao;

import com.plato.eurekaclient.model.Employee;
import com.plato.eurekaclient.model.Sex;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * @author by Roy Pan
 */
@Repository
public class EmployeeDao {
    static List<Employee> employeeList = new ArrayList<>();
    static {
        Employee emp = new Employee();
        emp.setEmpId("111");
        emp.setName("roy");
        emp.setDesignation("haha");
        emp.setSex(Sex.MALE);
        emp.setBirthday(LocalDate.now());
        emp.setSalary(100.12);
        employeeList.add(emp);
    }
    public Employee getEmployeeByEmpId(String empId){
        return employeeList.stream().filter(emp -> (emp.getEmpId().equals(empId))).findFirst().orElse(null);
    }

    public void addOne(String empId,String name){
        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setName(name);
        emp.setDesignation("haha");
        emp.setSex(Sex.MALE);
        emp.setBirthday(LocalDate.now());
        emp.setSalary(new Random().nextDouble());
        employeeList.add(emp);
    }

    public List<Employee> getAll(){
        return employeeList;
    }

}
