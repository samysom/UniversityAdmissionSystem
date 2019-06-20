package com.pro.uas.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Participant")
public class Participant {
	
	@Id
	@Column(name= "Roll_no")
	private int rollNo;
	
	@Column(name= "Email_id")
	private String emailId;
	
	@Column(name= "Application_id")
	private int applicationId;
	
	@Column(name= "Scheduled_program_id")
	private int programmId;
	
	@Column(name= "Application_Status")
	private String applicationStatus;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getProgrammId() {
		return programmId;
	}

	public void setProgrammId(int programmId) {
		this.programmId = programmId;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	@Override
	public String toString() {
		return "Participant [rollNo=" + rollNo + ", emailId=" + emailId + ", applicationId=" + applicationId
				+ ", programmId=" + programmId + ", ApplicationStatus=" + applicationStatus + "]";
	}
	
	
}
