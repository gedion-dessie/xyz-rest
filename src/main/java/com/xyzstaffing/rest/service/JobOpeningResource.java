package com.xyzstaffing.rest.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xyzstaffing.domain.JobOpening;
import com.xyzstaffing.service.JobOpeningService;

@Component
@Path("/job-openings")
public class JobOpeningResource {

	@Autowired
	private JobOpeningService jobOpeningService;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<JobOpening> getAllJobOpenings() {
		return jobOpeningService.findAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public JobOpening getJobOpening(@PathParam("id") long id) {
		return jobOpeningService.find(id);
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public JobOpening saveJobOpening(JobOpening jobOpening) {
		jobOpeningService.save(jobOpening);
		return null;
	}
}
