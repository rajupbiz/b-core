package com.blob.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="candidate")
public class Candidate {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy="shortlistedCandidate")
	private List<CandidateShortlistedProfile> shortlistedCandidates;
	
	@OneToOne(mappedBy="candidate")
	private CandidatePersonalDetail candidatePersonalDetail;
	
	@OneToOne(mappedBy="candidate")
	private CandidateFamily candidateFamily;
	
	@OneToOne(mappedBy="candidate")
	private CandidateAstroDetail candidateAstroDetail;
	
	@OneToOne(mappedBy="candidate")
	private CandidateExpectation candidateExpectation;
	
	@OneToMany(mappedBy="candidate")
	private List<CandidateEducation> candidateEducation;
	
	@OneToMany(mappedBy="candidate")
	private List<CandidateAddress> candidateAddress;
}
