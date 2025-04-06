package com.wipro.UseCaseStudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.UseCaseStudy.entity.Employee;
import com.wipro.UseCaseStudy.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<Employee> addCustomer(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<>(employee, HttpStatus.CREATED);

		return responseEntity;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> fetchCustomerDetails(@PathVariable("id") int empid) {
		Employee employee = employeeService.getEmployeeById(empid);

		if (employee == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	@GetMapping("/all")
	public List<Employee> fetchALLEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		return employees;

	}

	@PutMapping("/update")
	public ResponseEntity<Employee> editEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<>(employee, HttpStatus.OK);

		return responseEntity;
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int empid) {
		employeeService.deleteEmployee(empid);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<>(HttpStatus.OK);

		return responseEntity;
	}
}