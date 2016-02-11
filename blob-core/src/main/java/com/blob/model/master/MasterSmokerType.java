package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_smoker_type")
public class MasterSmokerType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="SmokerType")
	private String smokerType;
	
	@Column(name="SmokerTypeDesc")
	private String smokerTypeDesc;
	
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

	public String getSmokerType() {
		return smokerType;
	}

	public void setSmokerType(String smokerType) {
		this.smokerType = smokerType;
	}

	public String getSmokerTypeDesc() {
		return smokerTypeDesc;
	}

	public void setSmokerTypeDesc(String smokerTypeDesc) {
		this.smokerTypeDesc = smokerTypeDesc;
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