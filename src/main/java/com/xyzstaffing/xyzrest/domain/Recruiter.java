package com.xyzstaffing.xyzrest.domain;

import java.io.Serializable;

public class Recruiter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6790627135010841767L;

	private Person person;
	private String officePhoneNumber;
	private String extension;
	private String office;
	
	
	public Recruiter(Person person) {
		this.person = person;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}


	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}


	public String getExtension() {
		return extension;
	}


	public void setExtension(String extension) {
		this.extension = extension;
	}


	public String getOffice() {
		return office;
	}


	public void setOffice(String office) {
		this.office = office;
	}
	
	
}
