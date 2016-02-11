package com.blob.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.blob.model.common.Contact;
import com.blob.model.master.MasterRelationship;

@Entity
@Table(name="candidate_contact")
public class CandidateContact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="CandidateID")
	private Candidate candidate;
	
	@Embedded
	private Contact conatct;
	
	@OneToOne
	@JoinColumn(name="RelationshipID")
	private MasterRelationship relationship;

	@Column(name="IsPrimaryContact")
	private boolean isPrimaryContact;
	
	@Column(name="Status")
	private Character status;
	
	@Column(name="CreateUser")
	private Long createUser;
	
	@Column(name="CreateOn")
	private Date createOn;
	
	@Column(name="UpdateUser")
	private Long updateUser;
	
	@Column(name="UpdateOn")
	private Date updateOn;

	

	
	
	
}
