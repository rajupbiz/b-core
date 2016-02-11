package com.blob.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="candidate_education")
public class CandidateEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="CandidateID")
	private Candidate candidate;
	
	@Column(name="Degree")
	private String degree;

	@Column(name="Subject")
	private String subject;
	
	@Column(name="OtherEducation")
	private String otherEducation;

	@Column(name="EducationNote")
	private String educationNote;
	
	@Column(name="IsHighest")
	private boolean isHighest;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getOtherEducation() {
		return otherEducation;
	}

	public void setOtherEducation(String otherEducation) {
		this.otherEducation = otherEducation;
	}

	public String getEducationNote() {
		return educationNote;
	}

	public void setEducationNote(String educationNote) {
		this.educationNote = educationNote;
	}

	public boolean isHighest() {
		return isHighest;
	}

	public void setHighest(boolean isHighest) {
		this.isHighest = isHighest;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

	
	
	
}
