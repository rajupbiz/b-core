package com.blob.model.common;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.blob.model.master.MasterCommunication;

//@Entity
//@Table(name="contact")
@Embeddable
public class Contact {
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;

	@Column(name="EmailID")
	private String emailID;
	
	@Column(name="Mobile")
	private String mobile;
	
	@Column(name="landlinePhone")
	private String landlinePhone;
	
	@OneToOne
	@JoinColumn(name="PreferredCommunicationID")
	private MasterCommunication preferredCommunication;

	@Column(name="SkypeID")
	private String skypeID;
	
	@Column(name="LinkedInProfileID")
	private String linkedInProfileID;
	
	@Column(name="FacebookProfileID")
	private String facebookProfileID;
	
	@Column(name="WebsiteOrBlogID")
	private String websiteOrBlogID;

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

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLandlinePhone() {
		return landlinePhone;
	}

	public void setLandlinePhone(String landlinePhone) {
		this.landlinePhone = landlinePhone;
	}

	public MasterCommunication getPreferredCommunication() {
		return preferredCommunication;
	}

	public void setPreferredCommunication(MasterCommunication preferredCommunication) {
		this.preferredCommunication = preferredCommunication;
	}

	public String getSkypeID() {
		return skypeID;
	}

	public void setSkypeID(String skypeID) {
		this.skypeID = skypeID;
	}

	public String getLinkedInProfileID() {
		return linkedInProfileID;
	}

	public void setLinkedInProfileID(String linkedInProfileID) {
		this.linkedInProfileID = linkedInProfileID;
	}

	public String getFacebookProfileID() {
		return facebookProfileID;
	}

	public void setFacebookProfileID(String facebookProfileID) {
		this.facebookProfileID = facebookProfileID;
	}

	public String getWebsiteOrBlogID() {
		return websiteOrBlogID;
	}

	public void setWebsiteOrBlogID(String websiteOrBlogID) {
		this.websiteOrBlogID = websiteOrBlogID;
	}
	
	

}
