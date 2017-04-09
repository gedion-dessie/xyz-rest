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

import com.xyzstaffing.domain.Candidate;
import com.xyzstaffing.service.CandidateService;

@Component
@Path("/candidates")
public class CandidateResource {

	@Autowired
	private CandidateService candidateService;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Candidate> getAllCandidates() {
		return candidateService.findAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Candidate getCandidate(@PathParam("id") long id) {
		return candidateService.find(id);
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Candidate saveCandidate(Candidate candidate) {
		candidateService.save(candidate);
		return null;
	}
}
