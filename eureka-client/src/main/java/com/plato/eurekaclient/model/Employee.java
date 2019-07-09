package com.plato.eurekaclient.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author by Roy Pan
 */
@Data
public class Employee {
    private String empId;
    private String name;
    private String designation;
    private Sex sex;
    private LocalDate birthday;
    private double salary;
}
