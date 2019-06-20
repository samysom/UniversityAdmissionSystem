package com.pro.uas.service;

import java.util.List;

import com.pro.uas.dao.UniversityDAOJDBCImpl;
import com.pro.uas.dto.Application;
import com.pro.uas.dto.Participant;
import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.dto.Users;

public class UniversityServiceImpl implements UniversityManagementService{

	UniversityDAOJDBCImpl impl = new UniversityDAOJDBCImpl();	

	@Override
	public Users login(String loginId, String password, String role) {

		Users us = impl.login(loginId, password, role );

		if(us!=null)
		{
			return us;
		}
		return null;
	}


	@Override
	public boolean addProgramOffered(ProgramsOffered po) {

		boolean result = impl.addProgramOffered(po);
		if(result)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateProgramOffered(ProgramsOffered po) {

		boolean result = impl.updateProgramOffered(po);
		if(result)
		{
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteProgramOffered(String programName) {

		boolean result = impl.deleteProgramOffered(programName);
		if(result)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<ProgramsOffered> listAllPrograms() {

		List<ProgramsOffered> ls=impl.listAllPrograms();
		if(ls!=null) {
			return ls;
		}
		return null;
	}

	@Override
	public boolean createScheduledProgram(ProgrammsScheduled Ps) {

		boolean result = impl.createScheduledProgram(Ps);
		if(result)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateScheduledProgram(ProgrammsScheduled Ps) {

		boolean result = impl.updateScheduledProgram(Ps);
		if(result)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteScheduledProgram(int schProgrammId) {

		boolean result = impl.deleteScheduledProgram(schProgrammId);
		if(result)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<ProgrammsScheduled> listAllScheduledPrograms(String programName) {
		
		 List<ProgrammsScheduled> list = impl.listAllScheduledPrograms(programName);
		if(list!=null) {
			return list;
		}
		return null;
	}


	@Override
	public boolean applyApplication(Application ap) {

		boolean result = impl.applyApplication(ap);
		if(result)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteApplication(int applicationid) {

		boolean result = impl.deleteApplication(applicationid);
		if(result)
		{
			return true;
		}
		return false;
	}
	@Override
	public boolean updateApplication(String interviewdate, int applicationid) {
		
		boolean result = impl.updateApplication(interviewdate, applicationid);
		if(result)
		{
			return true;
		}
		return false;
	}
	@Override
	public List<Application> listAllApplications(int schProgramId) {
		
		List<Application> al=impl.listAllApplications(schProgramId);
		if(al!=null) {
			return al;
		}
		return null;
	}


	@Override
	public List<Participant> listParticipant(String emailId) {

		List<Participant> list=impl.listParticipant(emailId);
		if(list!=null)
		{
			return list;
		}

		return null;
	}



	@Override
	public boolean addParticipant(Participant p) {
		
		boolean result = impl.addParticipant(p);
		if(result)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteParticipant(int rollNo) {
		
		boolean result = impl.deleteParticipant(rollNo);
		if(result)
		{
			return true;
		}
		return false;
	}


	@Override
	public boolean updateParticipant(Participant p) {
		
		boolean result = impl.updateParticipant(p);
		if(result)
		{
			return true;
		}
		return false;
	}


	@Override
	public List<Participant> listAllParticipant() {
		
		List<Participant> ls=impl.listAllParticipant();
		if(ls!=null) {
			return ls;
		}
		return null;
	}


}	


