package com.xyzstaffing.service;

import java.util.List;

import com.xyzstaffing.domain.Candidate;

public interface CandidateService {
	public abstract Candidate find(long id);
	public abstract List<Candidate> findAll();
	public abstract void save(Candidate candidate);
}
