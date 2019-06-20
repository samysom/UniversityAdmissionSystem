package com.pro.uas.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Programs_Offered")
public class ProgramsOffered {
	
	@Id
	@Column(name= "ProgramName")
	private String programName;
	
	@Column(name= "Description")
	private String description;
	
	@Column(name= "Applicant_eligibility")
	private String eligibility;
	
	@Column(name= "Duration")
	private int duration;
	
	@Column(name= "Degree_certificate_offered")
	private String degreeCertificateOffered;
	
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDegreecertificateOffered() {
		return degreeCertificateOffered;
	}
	public void setDegreecertificateOffered(String degreecertificateOffered) {
		this.degreeCertificateOffered = degreecertificateOffered;
	}
	@Override
	public String toString() {
		return "ProgramsOffered [programName=" + programName + ", description=" + description + ", eligibility="
				+ eligibility + ", duration=" + duration + ", degreecertificateOffered=" + degreeCertificateOffered
				+ "]";
	}

}
