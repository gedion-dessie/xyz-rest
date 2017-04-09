package com.xyzstaffing.persistence.impl;

import org.springframework.stereotype.Repository;

import com.xyzstaffing.domain.JobOpening;
import com.xyzstaffing.persistence.JobOpeningDAO;

@Repository
public class JobOpeningDAOImpl extends GenericDAOImpl<JobOpening> implements JobOpeningDAO {

	public JobOpeningDAOImpl() {
		super.setDaoType(JobOpening.class);
	}
}
