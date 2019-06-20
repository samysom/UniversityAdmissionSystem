package com.pro.uas.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Application")
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "Application_id")
	private int applicationId;
	
	@Column(name= "Full_name")
	private String fullName;
	
	@Column(name= "Date_of_birth")
	private String dateOfBirth;
	
	@Column(name= "Hishest_qualification")
	private String hishestQualification;
	
	@Column(name= "Marks_obtained")
	private int marksObtained;
	
	@Column(name= "Goals")
	private String goals;
	
	@Column(name= "Email_id")
	private String emailId;
	
	@Column(name= "Scheduled_program_id")
	private int schProgramId;
	
	@Column(name= "Status")
	private String status;
	
	@Column(name= "Date_of_interview")
	private String interviewDate;

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHishestQualification() {
		return hishestQualification;
	}

	public void setHishestQualification(String hishestQualification) {
		this.hishestQualification = hishestQualification;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getSchProgramId() {
		return schProgramId;
	}

	public void setSchProgramId(int schProgramId) {
		this.schProgramId = schProgramId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", fullName=" + fullName + ", dateOfBirth=" + dateOfBirth
				+ ", hishestQualification=" + hishestQualification + ", marksObtained=" + marksObtained + ", goals="
				+ goals + ", emailId=" + emailId + ", schProgramId=" + schProgramId + ", status=" + status
				+ ", interviewDate=" + interviewDate + "]";
	}
	
	

}