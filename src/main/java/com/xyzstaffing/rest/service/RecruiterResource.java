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

import com.xyzstaffing.domain.Recruiter;
import com.xyzstaffing.service.RecruiterService;

@Component
@Path("/recruiters")
public class RecruiterResource {

	@Autowired
	private RecruiterService recruiterService;
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Recruiter getRecruiter(@PathParam("id") long id) {
		return recruiterService.find(id);
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Recruiter> getAllRecruiters() {
		return recruiterService.findAll();
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML})
	public Recruiter saveRecruiter(Recruiter recruiter) {
		recruiterService.save(recruiter);
		return null;
	}
}
