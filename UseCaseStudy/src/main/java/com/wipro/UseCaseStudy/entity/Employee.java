package com.wipro.UseCaseStudy.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	private int empid;
	private String name;
	private String basicSalary;
	private char grade;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", basicSalary=" + basicSalary + ", grade=" + grade
				+ "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(basicSalary, empid, grade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(basicSalary, other.basicSalary) && empid == other.empid && grade == other.grade
				&& Objects.equals(name, other.name);
	}

}
