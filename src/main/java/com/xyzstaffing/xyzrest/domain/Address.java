package com.xyzstaffing.xyzrest.domain;

import java.io.Serializable;

public class Address implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -1066067095176094274L;
	
	private String street;
	private String city;
	private USState state;
	private String zipCode;
	
	public Address(String street, String city, USState state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public USState getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}
	
	
	
}
