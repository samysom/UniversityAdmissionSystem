 package com.pro.uas.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Programms_Scheduled")
public class ProgrammsScheduled {

	@Id
	@Column(name= "Scheduled_program_id")
	private int scheduledProgramId;
	
	@Column(name= "ProgrammName")
	private String programmName;
	
	@Column(name= "Location")
	private String location;
	
	@Column(name= "Start_Date")
	private String startDate;
	
	@Column(name= "End_Date")
	private String endDate;
	
	@Column(name= "Sessions_per_week")
	private int sessionsPerWeek;

	public int getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getProgrammName() {
		return programmName;
	}

	public void setProgrammName(String programmName) {
		this.programmName = programmName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getSessionsPerWeek() {
		return sessionsPerWeek;
	}

	public void setSessionsPerWeek(int sessionsPerWeek) {
		this.sessionsPerWeek = sessionsPerWeek;
	}

	@Override
	public String toString() {
		return "ProgrammsScheduled [scheduledProgramId=" + scheduledProgramId + ", programmName=" + programmName
				+ ", location=" + location + ", startDate=" + startDate + ", endDate=" + endDate + ", sessionsPerWeek="
				+ sessionsPerWeek + "]";
	}
	
	
	
}	