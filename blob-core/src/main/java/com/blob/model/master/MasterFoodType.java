package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_food_type")
public class MasterFoodType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="FoodType")
	private String foodType;
	
	@Column(name="FoodTypeDesc")
	private String foodTypeDesc;
	
	@Column(name="SequenceNumber")
	private int sequenceNumber;
	
	@Column(name="Status")
	private Character status;
	
	@Column(name="CreateOn")
	private Date createOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getFoodTypeDesc() {
		return foodTypeDesc;
	}

	public void setFoodTypeDesc(String foodTypeDesc) {
		this.foodTypeDesc = foodTypeDesc;
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	
	
	
	
}
