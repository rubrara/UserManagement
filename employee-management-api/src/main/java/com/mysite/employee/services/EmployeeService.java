package com.mysite.employee.services;

import com.mysite.employee.model.Employee;

import java.util.List;

public interface EmployeeService {


    Employee createEmployee(Employee employee);

    boolean deleteEmployee(Long employeeId);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
