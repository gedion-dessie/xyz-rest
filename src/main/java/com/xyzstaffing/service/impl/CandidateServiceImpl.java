package com.xyzstaffing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyzstaffing.domain.Candidate;
import com.xyzstaffing.persistence.CandidateDAO;
import com.xyzstaffing.service.CandidateService;

@Service
@Transactional
public class CandidateServiceImpl implements CandidateService{

	@Autowired
	private CandidateDAO candidateDAO; 
	
	@Override
	public void save(Candidate candidate) {
		candidateDAO.save(candidate);
	}

	@Override
	public Candidate find(long id) {
		return candidateDAO.find(id);
	}

	@Override
	public List<Candidate> findAll() {
		return candidateDAO.findAll();
	}

}
