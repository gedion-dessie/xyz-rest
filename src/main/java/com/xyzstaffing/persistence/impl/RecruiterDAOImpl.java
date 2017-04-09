package com.xyzstaffing.persistence.impl;

import org.springframework.stereotype.Repository;

import com.xyzstaffing.domain.Recruiter;
import com.xyzstaffing.persistence.RecruiterDAO;

@Repository
public class RecruiterDAOImpl extends GenericDAOImpl<Recruiter> implements RecruiterDAO{
	
	public RecruiterDAOImpl() {
		super.setDaoType(Recruiter.class);
	}
}
