/*
 * Copyright (c) 2018 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 3 Oct, 2018
 * 
 * 
 */
package com.sivadas.anand.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sivadas.anand.entity.Address;
import com.sivadas.anand.entity.Employee;

/**
 * The Interface EmployeeRepository.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	/**
	 * Gets the employees by address.
	 *
	 * @param address the address
	 * @return the employees by address
	 */
	public List<Employee> getEmployeesByAddress(Address address);
	
}
