package com.xyzstaffing.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate implements Serializable {

	private static final long serialVersionUID = -2706145298294392878L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Embedded
	private Person person;

	@Column
	private int totalYearsOfExperience;

	@Column
	private String preferredPosition;

	@Column
	private String resumePath;

	public Candidate() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getTotalYearsOfExperience() {
		return totalYearsOfExperience;
	}

	public void setTotalYearsOfExperience(int totalYearsOfExperience) {
		this.totalYearsOfExperience = totalYearsOfExperience;
	}

	public String getPreferredPosition() {
		return preferredPosition;
	}

	public void setPreferredPosition(String preferredPosition) {
		this.preferredPosition = preferredPosition;
	}

	public String getResumePath() {
		return resumePath;
	}

	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}

}
