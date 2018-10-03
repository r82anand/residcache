/*
 * Copyright (c) 2018 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 3 Oct, 2018
 * 
 * 
 */
package com.sivadas.anand.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sivadas.anand.entity.Address;
import com.sivadas.anand.entity.Employee;
import com.sivadas.anand.repo.AddressRepository;
import com.sivadas.anand.repo.EmployeeRepository;

/**
 * The Class EmployeeService.
 */
@Service
public class EmployeeService {

	/** The employee repository. */
	@Autowired
	private EmployeeRepository employeeRepository;
	
	/** The address repository. */
	@Autowired
	private AddressRepository addressRepository;
	
	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 */
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}
	
	/**
	 * Gets the employee by id.
	 *
	 * @param id the id
	 * @return the employee by id
	 */
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

	/**
	 * Gets the all address.
	 *
	 * @return the all address
	 */
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}

}
