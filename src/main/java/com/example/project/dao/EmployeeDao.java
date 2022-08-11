package com.example.project.dao;

import com.example.project.entity.Employee;

public interface EmployeeDao {

	public boolean saveEmployee(Employee employee);
	public Employee getEmployee(int eid);
}
