package com.xyzstaffing.main;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import com.xyzstaffing.rest.service.CandidateResource;
import com.xyzstaffing.rest.service.JobOpeningResource;
import com.xyzstaffing.rest.service.RecruiterResource;

public class RestConfig extends ResourceConfig {

	public RestConfig() {
		// Filter to provide a bridge between JAX-RS and Spring request
		// attributes.
		register(RequestContextFilter.class);
		
		register(RecruiterResource.class);
		register(CandidateResource.class);
		register(JobOpeningResource.class);
	}
}