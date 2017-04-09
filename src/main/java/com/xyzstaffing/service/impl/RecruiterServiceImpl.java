package com.xyzstaffing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyzstaffing.domain.Recruiter;
import com.xyzstaffing.persistence.RecruiterDAO;
import com.xyzstaffing.service.RecruiterService;

@Service
@Transactional
public class RecruiterServiceImpl implements RecruiterService{
	
	@Autowired
	private RecruiterDAO recruiterDAO;
	
	@Override
	public void save(Recruiter recruiter) {
		recruiterDAO.save(recruiter);
	}

	@Override
	public Recruiter find(long id) {
		return recruiterDAO.find(id);
	}

	@Override
	public List<Recruiter> findAll() {
		return recruiterDAO.findAll();
	}

}
