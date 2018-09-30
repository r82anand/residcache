package com.sivadas.anand.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address implements Serializable {

	private static final long serialVersionUID = -6489915747505571374L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="ADD_CODE")
	private String addressCode;

	@Column(name="HOUSE_NAME")
	private String houseName;
	
	@Column(name="ADD_LINE_ONE")
	private String addLineOne;
	
	@Column(name="CITY")
	private String city;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getAddLineOne() {
		return addLineOne;
	}

	public void setAddLineOne(String addLineOne) {
		this.addLineOne = addLineOne;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAddressCode() {
		return addressCode;
	}
	
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	

}
