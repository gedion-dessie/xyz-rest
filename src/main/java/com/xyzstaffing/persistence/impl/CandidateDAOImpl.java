package com.xyzstaffing.persistence.impl;

import org.springframework.stereotype.Repository;

import com.xyzstaffing.domain.Candidate;
import com.xyzstaffing.persistence.CandidateDAO;

@Repository
public class CandidateDAOImpl extends GenericDAOImpl<Candidate> implements CandidateDAO {

	public CandidateDAOImpl() {
		super.setDaoType(Candidate.class);
	}
}
