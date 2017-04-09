package com.xyzstaffing.service;

import java.util.List;

import com.xyzstaffing.domain.JobOpening;

public interface JobOpeningService {
	public abstract JobOpening find(long id);
	public abstract List<JobOpening> findAll();
	public abstract void save(JobOpening jobOpening);
}
