/*
 * Copyright (c) 2018 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 3 Oct, 2018
 * 
 * 
 */
package com.sivadas.anand.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Address.
 */
@Entity
@Table(name="ADDRESS")
public class Address implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6489915747505571374L;
	
	/** The id. */
	@Id
	@GeneratedValue
	private Long id;
	
	/** The address code. */
	@Column(name="ADD_CODE")
	private String addressCode;

	/** The house name. */
	@Column(name="HOUSE_NAME")
	private String houseName;
	
	/** The add line one. */
	@Column(name="ADD_LINE_ONE")
	private String addLineOne;
	
	/** The city. */
	@Column(name="CITY")
	private String city;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the house name.
	 *
	 * @return the house name
	 */
	public String getHouseName() {
		return houseName;
	}

	/**
	 * Sets the house name.
	 *
	 * @param houseName the new house name
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	/**
	 * Gets the adds the line one.
	 *
	 * @return the adds the line one
	 */
	public String getAddLineOne() {
		return addLineOne;
	}

	/**
	 * Sets the adds the line one.
	 *
	 * @param addLineOne the new adds the line one
	 */
	public void setAddLineOne(String addLineOne) {
		this.addLineOne = addLineOne;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the address code.
	 *
	 * @return the address code
	 */
	public String getAddressCode() {
		return addressCode;
	}
	
	/**
	 * Sets the address code.
	 *
	 * @param addressCode the new address code
	 */
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	

}
