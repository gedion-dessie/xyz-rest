package com.xyzstaffing.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "job_openings")
public class JobOpening implements Serializable {

	private static final long serialVersionUID = 356554945613842810L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique = true, length = 20)
	private String jobId;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String responsibilities;
	
	@Column
	private String requirements;
	
	@Column
	private String miscellaneous;
	
	@OneToOne
	@JoinColumn(name = "recruiter_id")
	private Recruiter postedBy;
	
	@OneToMany
	@JoinTable(
		name = "job_opening_candidates", 
		joinColumns=@JoinColumn(name="job_opening_id"),
		inverseJoinColumns=@JoinColumn(name = "candidate_id")
	)
	private List<Candidate> candidates;

	public JobOpening() {
		candidates = new ArrayList<Candidate>();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(String miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	public Recruiter getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(Recruiter postedBy) {
		this.postedBy = postedBy;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	
}
