package com.pro.uas.service;

import java.util.List;

import com.pro.uas.dto.Application;
import com.pro.uas.dto.Participant;
import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.dto.Users;

public interface UniversityManagementService {

	public Users login(String loginId, String password, String role);

	public boolean addProgramOffered(ProgramsOffered po);

	public boolean updateProgramOffered(ProgramsOffered po);

	public boolean deleteProgramOffered(String programName);

	public List<ProgramsOffered> listAllPrograms();

	public boolean createScheduledProgram(ProgrammsScheduled Ps);

	public boolean updateScheduledProgram(ProgrammsScheduled Ps);

	public boolean deleteScheduledProgram(int schProgrammId);

	public List<ProgrammsScheduled> listAllScheduledPrograms(String programName);

	public boolean applyApplication(Application ap);

	public boolean deleteApplication(int applicationid);

	public boolean updateApplication(String interviewdate, int applicationid);

	public List<Application> listAllApplications(int schProgramId);

	public List<Participant> listParticipant(String emailId);

	public boolean addParticipant(Participant p);

	public boolean deleteParticipant(int rollNo);

	public boolean updateParticipant(Participant p);

	public List<Participant> listAllParticipant();



}
