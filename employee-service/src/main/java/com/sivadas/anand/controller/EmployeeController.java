/*
 * Copyright (c) 2018 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 3 Oct, 2018
 * 
 * 
 */
package com.sivadas.anand.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sivadas.anand.entity.Address;
import com.sivadas.anand.entity.Employee;
import com.sivadas.anand.service.EmployeeService;

/**
 * The Class EmployeeController.
 */
@RestController
@CrossOrigin
@EnableCaching
public class EmployeeController {

	/** The logger. */
	private static Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	/** The employee service. */
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * Gets the employees.
	 *
	 * @return the employees
	 */
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(method=RequestMethod.GET, value="/employees", produces="application/json; charset=utf-8")
	public List<Employee> getEmployees() {
		
		List<Employee> employees = null;
		employees = employeeService.getAllEmployees();
		return employees;
	}
	
	/**
	 * Gets the employee.
	 *
	 * @param empId the emp id
	 * @return the employee
	 */
	@Cacheable(value = "employees", key = "#empId")
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(method=RequestMethod.GET, value="/employee/{empId}", produces="application/json; charset=utf-8")
	public Optional<Employee> getEmployee(@PathVariable("empId") Long empId) {
		
		Optional<Employee> employeeById = null;
		employeeById = employeeService.getEmployeeById(empId);
		return employeeById;
	}
	
	/**
	 * Gets the addresses.
	 *
	 * @return the addresses
	 */
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(method=RequestMethod.GET, value="/address", produces="application/json; charset=utf-8")
	public List<Address> getAddresses() {
		
		List<Address> addresses = null;
		addresses = employeeService.getAllAddress();
		return addresses;
	}
}
