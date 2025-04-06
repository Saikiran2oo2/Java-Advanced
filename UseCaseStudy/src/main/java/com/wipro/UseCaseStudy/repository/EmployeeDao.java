package com.wipro.UseCaseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.UseCaseStudy.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

}
