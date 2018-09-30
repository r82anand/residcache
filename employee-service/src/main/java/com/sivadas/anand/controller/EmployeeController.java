package com.sivadas.anand.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sivadas.anand.entity.Employee;
import com.sivadas.anand.service.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController {

	private static Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(method=RequestMethod.GET, value="/employees", produces="application/json; charset=utf-8")
	public List<Employee> getEmployees() {
		
		List<Employee> employees = null;
		employees = employeeService.getAllEmployees();
		return employees;
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(method=RequestMethod.GET, value="/employee/{empId}", produces="application/json; charset=utf-8")
	public Optional<Employee> getEmployee(@PathVariable("empId") Long empId) {
		
		Optional<Employee> employeeById = null;
		employeeById = employeeService.getEmployeeById(empId);
		return employeeById;
	}
	
}
