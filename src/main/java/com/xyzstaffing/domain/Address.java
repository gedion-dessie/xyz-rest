package com.xyzstaffing.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Address implements Serializable {

	private static final long serialVersionUID = -1066067095176094274L;

	@Column
	private String street;
	@Column
	private String city;

	@Enumerated(EnumType.STRING)
	private USState state;
	@Column
	private String zipCode;

	public Address() {

	}

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
