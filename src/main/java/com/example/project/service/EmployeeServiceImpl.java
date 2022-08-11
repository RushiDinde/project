package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.dao.EmployeeDao;
import com.example.project.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public boolean saveEmployee(Employee employee) {
		
		return dao.saveEmployee(employee);
	}

	@Override
	public Employee getEmployee(int eid) {
		
		return dao.getEmployee(eid);
	}

}
