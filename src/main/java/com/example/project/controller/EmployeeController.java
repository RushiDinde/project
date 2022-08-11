package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Employee;
import com.example.project.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping(value = "/saveEmployee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
		boolean save = service.saveEmployee(employee);
		if (save) {
			return new ResponseEntity<String>("saved!!", HttpStatus.CREATED);

		} else {
			return new ResponseEntity<String>(" not saved!!", HttpStatus.OK);
		}

	}

	@GetMapping(value = "getEmployeeById")
	public ResponseEntity<Employee> getEmployeeById(@RequestParam int eid) {
		Employee employee = service.getEmployee(eid);
		if(employee!=null) {
			return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		}else {
			return new ResponseEntity<Employee>(employee,HttpStatus.NOT_FOUND);
		}
		
	}

}
