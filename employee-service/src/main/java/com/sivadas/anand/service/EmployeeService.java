package com.sivadas.anand.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sivadas.anand.entity.Address;
import com.sivadas.anand.entity.Employee;
import com.sivadas.anand.repo.AddressRepository;
import com.sivadas.anand.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}

}
