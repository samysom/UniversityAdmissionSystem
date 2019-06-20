package com.pro.uas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.uas.dao.UniversityDAOJPAImpl;
import com.pro.uas.dao.UniversityManagementDAO;
import com.pro.uas.dto.Application;
import com.pro.uas.dto.Participant;
import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.dto.Users;

@Service
public class UniversityServiceJPAImpl implements UniversityManagementService{

	@Autowired
	UniversityManagementDAO impl=new UniversityDAOJPAImpl();

	@Override
	public Users login(String loginId, String password, String role) {

		Users user=impl.login(loginId, password, role);
		if(user!=null)
		{
			return user;
		}
		return null;
	}
	
	@Override
	public boolean addProgramOffered(ProgramsOffered po) {
		
		boolean b=impl.addProgramOffered(po);
		if(b==true)
		{
			return true;
		}
		return false;
	}
		
	@Override
	public boolean updateProgramOffered(ProgramsOffered po) {

		boolean b=impl.updateProgramOffered(po);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteProgramOffered(String programName) {
		
		boolean b=impl.deleteProgramOffered(programName);
		if(b==true)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public List<ProgramsOffered> listAllPrograms() {

		List<ProgramsOffered> list=impl.listAllPrograms();
		if(list!=null)
		{
			return list;
		}

		return null;
	}



	@Override
	public boolean createScheduledProgram(ProgrammsScheduled Ps2) {
		
		boolean b=impl.createScheduledProgram(Ps2);
		if(b==true)
		{
			return true;
		}
		return false;
	}
	@Override
	public boolean updateScheduledProgram(ProgrammsScheduled Ps) {

		boolean b=impl.updateScheduledProgram(Ps);
		if(b==true)
		{
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteScheduledProgram(int scheduledProgramId) {
		
		boolean b=impl.deleteScheduledProgram(scheduledProgramId);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<ProgrammsScheduled> listAllScheduledPrograms(String programmName) {

		List<ProgrammsScheduled> list=impl.listAllScheduledPrograms(programmName);
		if(list!=null)
		{
			return list;
		}

		return null;
	}


	@Override
	public boolean applyApplication(Application ap) {
		
	boolean b=impl.applyApplication(ap);
	if(b==true)
	{
		return true;
	}
	return false;
}

	@Override
	public boolean deleteApplication(int applicationid) {
		
		boolean b=impl.deleteApplication(applicationid);
		if(b==true)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public boolean updateApplication(String interviewdate, int applicationid) {
		
		boolean b=impl.updateApplication(interviewdate, applicationid);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<Application> listAllApplications(int schProgramId) {

		List<Application> list=impl.listAllApplications(schProgramId);
		if(list!=null)
		{
			return list;
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
		
		boolean b=impl.addParticipant(p);
		if(b==true)
		{
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteParticipant(int rollNo) {
		
		boolean b=impl.deleteParticipant(rollNo);
		if(b==true)
		{
			return true;
		}
		return false;
	}
	@Override
	public boolean updateParticipant(Participant p) {
		
		boolean b=impl.updateParticipant(p);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<Participant> listAllParticipant() {
		
		List<Participant> list=impl.listAllParticipant();
		if(list!=null)
		{
			return list;
		}

		return null;
	}

}
