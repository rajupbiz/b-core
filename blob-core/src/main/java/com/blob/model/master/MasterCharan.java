package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_charan")
public class MasterCharan {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="Charan")
	private String charan;
	
	@Column(name="CharanDesc")
	private String charanDesc;
	
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

	public String getCharan() {
		return charan;
	}

	public void setCharan(String charan) {
		this.charan = charan;
	}

	public String getCharanDesc() {
		return charanDesc;
	}

	public void setCharanDesc(String charanDesc) {
		this.charanDesc = charanDesc;
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
