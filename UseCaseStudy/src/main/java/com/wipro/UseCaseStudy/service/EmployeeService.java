package com.wipro.UseCaseStudy.service;

import java.util.List;

import com.wipro.UseCaseStudy.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	Employee getEmployeeById(int empid);
	List<Employee> getAllEmployees();
     void deleteEmployee(int empid);


}
