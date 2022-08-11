package com.example.project.service;

import org.springframework.stereotype.Service;

import com.example.project.entity.Employee;

public interface EmployeeService {
	public boolean saveEmployee(Employee employee);
	public Employee getEmployee(int eid);
	

}
