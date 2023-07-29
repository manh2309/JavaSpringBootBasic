package com.manhnt.demojavasp.service;

import com.manhnt.demojavasp.model.Employee;

import java.util.List;

public interface IEmployeeService {
    //Add Employee
    public Employee addEmployee(Employee employee);

    //Update Employee
    public Employee updateEmployee(long id, Employee employee);

    //Delete Employee
    public boolean deleteEmployee(long id);

    //Read List Employee
    public List<Employee> getAllEmployee();
    public Employee getOneEmployee(long id);
}
