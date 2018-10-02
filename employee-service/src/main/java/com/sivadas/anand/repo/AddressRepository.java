package com.sivadas.anand.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sivadas.anand.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

	public Optional<Address> findById(Long id);
}
