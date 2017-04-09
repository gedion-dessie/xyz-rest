package com.xyzstaffing.service;

import java.util.List;

import com.xyzstaffing.domain.Recruiter;

public interface RecruiterService {
	public abstract Recruiter find(long id);
	public abstract List<Recruiter> findAll();
	public abstract void save(Recruiter recruiter);
}
