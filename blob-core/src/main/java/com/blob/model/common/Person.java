package com.blob.model.common;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.blob.model.master.MasterBloodGroup;
import com.blob.model.master.MasterBodyType;
import com.blob.model.master.MasterDrinkerType;
import com.blob.model.master.MasterFoodType;
import com.blob.model.master.MasterGender;
import com.blob.model.master.MasterMaritalStatus;
import com.blob.model.master.MasterMarriageType;
import com.blob.model.master.MasterMotherTongue;
import com.blob.model.master.MasterReligion;
import com.blob.model.master.MasterSmokerType;

//@Entity
//@Table(name="person")
@Embeddable
public class Person {
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;*/

	@Column(name="FirstName")
	private String firstName;

	@Column(name="LastName")
	private String lastName;
	
	@Column(name="MiddleName")
	private String middleName;
	
	@Column(name="AboutMe")
	private String aboutMe;
	
	@ManyToOne
	@JoinColumn(name="GenderID")
	private MasterGender gender;
	
	@Column(name="Height")
	private float height;
	
	@Column(name="Weight")
	private float weight;
	
	@ManyToOne
	@JoinColumn(name="BloodGroupID")
	private MasterBloodGroup bloodGroup;
	
	@ManyToOne
	@JoinColumn(name="MaritalStatusID")
	private MasterMaritalStatus maritalStatus;
	
	@ManyToOne
	@JoinColumn(name="MarriageTypeID")
	private MasterMarriageType marriageType;
	
	@ManyToOne
	@JoinColumn(name="ReligionID")
	private MasterReligion religion;
	
	@ManyToOne
	@JoinColumn(name="MotherTongueID")
	private MasterMotherTongue motherTongue;
	
	@Column(name="Caste")
	private String caste;
	
	@Column(name="Gotra")
	private String gotra;
	
	@Column(name="Devak")
	private String devak;
	
	@Column(name="Complextion")
	private String complextion;
	
	@Column(name="Personality")
	private String personality;
	
	@Column(name="Specs")
	private String specs;
	
	@Column(name="Lens")
	private String lens;
	
	@ManyToOne
	@JoinColumn(name="BodyTypeID")
	private MasterBodyType bodyType;
	
	@ManyToOne
	@JoinColumn(name="FoodTypeID")
	private MasterFoodType foodType;
	
	@Column(name="Hobby")
	private String hobby;
	
	@Column(name="Handicaped")
	private boolean handicaped;
	
	@Column(name="HandicapDetail")
	private String handicapDetail;
	
	@ManyToOne
	@JoinColumn(name="SmokerTypeID")
	private MasterSmokerType smokerType;
	
	@ManyToOne
	@JoinColumn(name="DrinkerTypeID")
	private MasterDrinkerType drinkerType;
	
	@Column(name="CreateOn")
	private Date createOn;
	
	@Column(name="UpdateUser")
	private Long updateUser;
	
	@Column(name="UpdateOn")
	private Date updateOn;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public MasterGender getGender() {
		return gender;
	}

	public void setGender(MasterGender gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public MasterBloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(MasterBloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public MasterMaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MasterMaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public MasterMarriageType getMarriageType() {
		return marriageType;
	}

	public void setMarriageType(MasterMarriageType marriageType) {
		this.marriageType = marriageType;
	}

	public MasterReligion getReligion() {
		return religion;
	}

	public void setReligion(MasterReligion religion) {
		this.religion = religion;
	}

	public MasterMotherTongue getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(MasterMotherTongue motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getGotra() {
		return gotra;
	}

	public void setGotra(String gotra) {
		this.gotra = gotra;
	}

	public String getDevak() {
		return devak;
	}

	public void setDevak(String devak) {
		this.devak = devak;
	}

	public String getComplextion() {
		return complextion;
	}

	public void setComplextion(String complextion) {
		this.complextion = complextion;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public String getLens() {
		return lens;
	}

	public void setLens(String lens) {
		this.lens = lens;
	}

	public MasterBodyType getBodyType() {
		return bodyType;
	}

	public void setBodyType(MasterBodyType bodyType) {
		this.bodyType = bodyType;
	}

	public MasterFoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(MasterFoodType foodType) {
		this.foodType = foodType;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public boolean isHandicaped() {
		return handicaped;
	}

	public void setHandicaped(boolean handicaped) {
		this.handicaped = handicaped;
	}

	public String getHandicapDetail() {
		return handicapDetail;
	}

	public void setHandicapDetail(String handicapDetail) {
		this.handicapDetail = handicapDetail;
	}

	public MasterSmokerType getSmokerType() {
		return smokerType;
	}

	public void setSmokerType(MasterSmokerType smokerType) {
		this.smokerType = smokerType;
	}

	public MasterDrinkerType getDrinkerType() {
		return drinkerType;
	}

	public void setDrinkerType(MasterDrinkerType drinkerType) {
		this.drinkerType = drinkerType;
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
