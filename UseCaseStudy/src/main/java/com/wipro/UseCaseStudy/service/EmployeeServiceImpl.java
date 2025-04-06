package com.wipro.UseCaseStudy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.UseCaseStudy.entity.Employee;
import com.wipro.UseCaseStudy.exception.EmployeeNotFoundException;
import com.wipro.UseCaseStudy.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee saveEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
		
	}

	@Override
	public Employee getEmployeeById(int empid) {
		Optional<Employee> optionalEmployee = employeeDao.findById(empid);
		if(optionalEmployee.isEmpty()) {
			
		}
		return optionalEmployee.get();
	}
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=employeeDao.findAll();
		return employees;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> optionalEmployee=employeeDao.findById(employee.getEmpid());
		if(optionalEmployee.isEmpty()) {
			
		}
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(int empid) {
		Optional<Employee> optionalEmployee=employeeDao.findById(empid);
		if(optionalEmployee.isEmpty()) {
			throw new EmployeeNotFoundException("Product not existing with id:"+empid);
			
			
		}
		Employee product = optionalEmployee.get();
		employeeDao.delete(product);
		
	}
}