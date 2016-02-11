package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_visibility_field")
public class MasterVisibilityField {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="VisibilityField")
	private String visibilityField;
	
	@Column(name="VisibilityFieldDesc")
	private String visibilityFieldDesc;
	
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

	public String getVisibilityField() {
		return visibilityField;
	}

	public void setVisibilityField(String visibilityField) {
		this.visibilityField = visibilityField;
	}

	public String getVisibilityFieldDesc() {
		return visibilityFieldDesc;
	}

	public void setVisibilityFieldDesc(String visibilityFieldDesc) {
		this.visibilityFieldDesc = visibilityFieldDesc;
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
