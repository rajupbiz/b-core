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
@Table(name="candidate_family")
public class CandidateFamily {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="CandidateID")
	private Candidate candidate;
	
	@Column(name="AboutFamily")
	private String aboutFamily;

	@Column(name="FatherFirstName")
	private String fatherFirstName;
	
	@Column(name="FatherLastName")
	private String fatherLastName;
	
	@Column(name="FathersOccupation")
	private String fathersOccupation;
	
	@Column(name="FathersYearlyIncome")
	private double fathersYearlyIncome;
	
	@Column(name="MotherFirstName")
	private String motherFirstName;
	
	@Column(name="MothersOccupation")
	private String mothersOccupation;
	
	@Column(name="MothersYearlyIncome")
	private double mothersYearlyIncome;
	
	@Column(name="NativePlace")
	private String nativePlace;
	
	@Column(name="NoOfBrother")
	private int noOfBrother;
	
	@Column(name="NoOfSister")
	private int noOfSister;
	
	@Column(name="NoOfMarriedBrother")
	private int noOfMarriedBrother;
	
	@Column(name="NoOfMarriedSister")
	private int noOfMarriedSister;
	
	@Column(name="IntercastInFamily")
	private boolean intercastInFamily;
	
	@Column(name="IntercastDetail")
	private String intercastDetail;
	
	@Column(name="FamilyWealth")
	private String familyWealth;
	
	@Column(name="MamasFirstName")
	private String mamasFirstName;
	
	@Column(name="MamasLastName")
	private String mamasLastName;
	
	@Column(name="MamasNativePlace")
	private String mamasNativePlace;
	
	@Column(name="Relatives")
	private String relatives;
	
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

	public String getAboutFamily() {
		return aboutFamily;
	}

	public void setAboutFamily(String aboutFamily) {
		this.aboutFamily = aboutFamily;
	}

	public String getFatherFirstName() {
		return fatherFirstName;
	}

	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getFathersOccupation() {
		return fathersOccupation;
	}

	public void setFathersOccupation(String fathersOccupation) {
		this.fathersOccupation = fathersOccupation;
	}

	public double getFathersYearlyIncome() {
		return fathersYearlyIncome;
	}

	public void setFathersYearlyIncome(double fathersYearlyIncome) {
		this.fathersYearlyIncome = fathersYearlyIncome;
	}

	public String getMotherFirstName() {
		return motherFirstName;
	}

	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}

	public String getMothersOccupation() {
		return mothersOccupation;
	}

	public void setMothersOccupation(String mothersOccupation) {
		this.mothersOccupation = mothersOccupation;
	}

	public double getMothersYearlyIncome() {
		return mothersYearlyIncome;
	}

	public void setMothersYearlyIncome(double mothersYearlyIncome) {
		this.mothersYearlyIncome = mothersYearlyIncome;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public int getNoOfBrother() {
		return noOfBrother;
	}

	public void setNoOfBrother(int noOfBrother) {
		this.noOfBrother = noOfBrother;
	}

	public int getNoOfSister() {
		return noOfSister;
	}

	public void setNoOfSister(int noOfSister) {
		this.noOfSister = noOfSister;
	}

	public int getNoOfMarriedBrother() {
		return noOfMarriedBrother;
	}

	public void setNoOfMarriedBrother(int noOfMarriedBrother) {
		this.noOfMarriedBrother = noOfMarriedBrother;
	}

	public int getNoOfMarriedSister() {
		return noOfMarriedSister;
	}

	public void setNoOfMarriedSister(int noOfMarriedSister) {
		this.noOfMarriedSister = noOfMarriedSister;
	}

	public boolean isIntercastInFamily() {
		return intercastInFamily;
	}

	public void setIntercastInFamily(boolean intercastInFamily) {
		this.intercastInFamily = intercastInFamily;
	}

	public String getIntercastDetail() {
		return intercastDetail;
	}

	public void setIntercastDetail(String intercastDetail) {
		this.intercastDetail = intercastDetail;
	}

	public String getFamilyWealth() {
		return familyWealth;
	}

	public void setFamilyWealth(String familyWealth) {
		this.familyWealth = familyWealth;
	}

	public String getMamasFirstName() {
		return mamasFirstName;
	}

	public void setMamasFirstName(String mamasFirstName) {
		this.mamasFirstName = mamasFirstName;
	}

	public String getMamasLastName() {
		return mamasLastName;
	}

	public void setMamasLastName(String mamasLastName) {
		this.mamasLastName = mamasLastName;
	}

	public String getMamasNativePlace() {
		return mamasNativePlace;
	}

	public void setMamasNativePlace(String mamasNativePlace) {
		this.mamasNativePlace = mamasNativePlace;
	}

	public String getRelatives() {
		return relatives;
	}

	public void setRelatives(String relatives) {
		this.relatives = relatives;
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
