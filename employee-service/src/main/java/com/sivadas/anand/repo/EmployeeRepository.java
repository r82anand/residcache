package com.sivadas.anand.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sivadas.anand.entity.Address;
import com.sivadas.anand.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public List<Employee> getEmployeesByAddress(Address address);
	
}
