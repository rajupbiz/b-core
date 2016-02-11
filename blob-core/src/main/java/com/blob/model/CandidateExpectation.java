package com.blob.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="candidate_expectation")
public class CandidateExpectation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="CandidateID")
	private Candidate candidate;
	
	@Column(name="AgeDiffrenceMax")
	private int ageDiffrenceMax;

	@Column(name="AgeDiffrenceMin")
	private int ageDiffrenceMin;
	
	@Column(name="HightDiffrenceMax")
	private float hightDiffrenceMax;
	
	@Column(name="HeightDiffrenceMin")
	private float heightDiffrenceMin;
	
	@Column(name="Education")
	private String education;
	
	@Column(name="Occupation")
	private String occupation;
	
	// TODO : need to confirm column names for Yealy income
	@Column(name="YearlyIncomeMin")
	private int yearlyIncomeMin;
	
	@Column(name="YearlyIncomeMax")
	private int yearlyIncomeMax;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="Mangal")
	private boolean mangal;
	
	@Column(name="ExpectationNote")
	private String expectationNote;
	
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

	public int getAgeDiffrenceMax() {
		return ageDiffrenceMax;
	}

	public void setAgeDiffrenceMax(int ageDiffrenceMax) {
		this.ageDiffrenceMax = ageDiffrenceMax;
	}

	public int getAgeDiffrenceMin() {
		return ageDiffrenceMin;
	}

	public void setAgeDiffrenceMin(int ageDiffrenceMin) {
		this.ageDiffrenceMin = ageDiffrenceMin;
	}

	public float getHightDiffrenceMax() {
		return hightDiffrenceMax;
	}

	public void setHightDiffrenceMax(float hightDiffrenceMax) {
		this.hightDiffrenceMax = hightDiffrenceMax;
	}

	public float getHeightDiffrenceMin() {
		return heightDiffrenceMin;
	}

	public void setHeightDiffrenceMin(float heightDiffrenceMin) {
		this.heightDiffrenceMin = heightDiffrenceMin;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getYearlyIncomeMin() {
		return yearlyIncomeMin;
	}

	public void setYearlyIncomeMin(int yearlyIncomeMin) {
		this.yearlyIncomeMin = yearlyIncomeMin;
	}

	public int getYearlyIncomeMax() {
		return yearlyIncomeMax;
	}

	public void setYearlyIncomeMax(int yearlyIncomeMax) {
		this.yearlyIncomeMax = yearlyIncomeMax;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isMangal() {
		return mangal;
	}

	public void setMangal(boolean mangal) {
		this.mangal = mangal;
	}

	public String getExpectationNote() {
		return expectationNote;
	}

	public void setExpectationNote(String expectationNote) {
		this.expectationNote = expectationNote;
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
