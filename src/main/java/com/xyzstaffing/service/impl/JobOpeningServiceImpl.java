package com.xyzstaffing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyzstaffing.domain.JobOpening;
import com.xyzstaffing.persistence.JobOpeningDAO;
import com.xyzstaffing.service.JobOpeningService;

@Service
@Transactional
public class JobOpeningServiceImpl implements JobOpeningService{

	@Autowired
	private JobOpeningDAO jobOpeningDAO;
	
	@Override
	public void save(JobOpening jobOpening) {
		jobOpeningDAO.save(jobOpening);
	}

	@Override
	public JobOpening find(long id) {
		return jobOpeningDAO.find(id);
	}

	@Override
	public List<JobOpening> findAll() {
		return jobOpeningDAO.findAll();
	}

}
