package com.pro.uas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pro.uas.dao.UniversityManagementDAO;
import com.pro.uas.dto.Application;
import com.pro.uas.dto.Participant;
import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.dto.Users;

@Repository
public class UniversityDAOJPAImpl implements UniversityManagementDAO{

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public Users login(String loginId, String password, String role) {

	try {
		

		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		String query="Select us from Users us where us.loginid =:loginId AND us.password =:password AND us.role =:role";
		TypedQuery<Users> qu=em.createQuery(query,Users.class);
		qu.setParameter("loginId", loginId);
		qu.setParameter("password", password);
		qu.setParameter("role", role);
		Users user=qu.getSingleResult();
		
		

		if(user!=null)
		{
			if(em!=null) {
				em.getTransaction().commit();
				em.close();
			}
			return user;
		}
		else
			return null;
	}
	catch(Exception e)
	{
		return null
			;
	}

	}


	@Override
	public boolean addProgramOffered(ProgramsOffered po) {

		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(po);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}


	@Override
	public boolean updateProgramOffered(ProgramsOffered po) {

		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="update ProgramsOffered p  set  p.description =:desp, p.eligibility =:apleligibility, "
				+ " p.duration =:dur, p.degreeCertificateOffered =:degrcertoff where p.programName =:proname";
		Query qu=manager.createQuery(query);
		qu.setParameter("desp", po.getDescription());
		qu.setParameter("apleligibility", po.getEligibility());
		qu.setParameter("dur", po.getDuration());
		qu.setParameter("degrcertoff", po.getDegreecertificateOffered());
		qu.setParameter("proname", po.getProgramName());
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteProgramOffered(String programName) {
		
		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="delete from ProgramsOffered op   where  op.programName =:programName ";
			

		Query qu=manager.createQuery(query);
		qu.setParameter("programName", programName);
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}

	@Override
	public List<ProgramsOffered> listAllPrograms() {

		EntityManager programsoffered=emf.createEntityManager();
		programsoffered.getTransaction().begin();
		String query="select op from ProgramsOffered op";
		TypedQuery<ProgramsOffered> qu= programsoffered.createQuery(query,ProgramsOffered.class);
		List<ProgramsOffered> list=qu.getResultList();
		if(list!=null)
		{
			if( programsoffered!=null) {
				programsoffered.getTransaction().commit();
				programsoffered.close();
			}
			return list;
		}
		return null;
	}

	@Override
	public boolean createScheduledProgram(ProgrammsScheduled Ps1) {

		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(Ps1);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}

	@Override
	public boolean updateScheduledProgram(ProgrammsScheduled Ps) {

		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="update ProgrammsScheduled sp set  sp.programmName =:schproname, sp.location =:loc, sp.startDate =:sdate, "
				+ "sp.endDate =:edate, sp.sessionsPerWeek =:seperweek  where  sp.scheduledProgramId =:id";

		Query qu=manager.createQuery(query);
		qu.setParameter("schproname", Ps.getProgrammName());
		qu.setParameter("loc", Ps.getLocation());
		qu.setParameter("sdate", Ps.getStartDate());
		qu.setParameter("edate", Ps.getEndDate());
		qu.setParameter("seperweek", Ps.getSessionsPerWeek());
		qu.setParameter("id", Ps.getScheduledProgramId());
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteScheduledProgram(int scheduledProgramId) {

		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="delete from  ProgrammsScheduled ps   where  ps.scheduledProgramId =:scheduledProgramId ";
			

		Query qu=manager.createQuery(query);
		qu.setParameter("scheduledProgramId", scheduledProgramId);
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}
	@Override
	public List<ProgrammsScheduled> listAllScheduledPrograms(String programmName) {

		EntityManager ProgramsScheduled=emf.createEntityManager();
		ProgramsScheduled.getTransaction().begin();
		String query="select ps from ProgrammsScheduled ps where ps.programmName =:programmName";
		TypedQuery<ProgrammsScheduled> qu= ProgramsScheduled.createQuery(query,ProgrammsScheduled.class);
		qu.setParameter("programmName", programmName);
		List<ProgrammsScheduled> list=qu.getResultList();
		if(list!=null)
		{
			if( ProgramsScheduled!=null) {
				ProgramsScheduled.getTransaction().commit();
				ProgramsScheduled.close();
			}
			return list;
		}
		return null;
	}

	@Override
	public boolean applyApplication(Application app) {

		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(app);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}
	
	@Override
	public boolean deleteApplication(int applicationId) {

		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="delete from Application app   where  app.applicationId =:applicationId ";
			

		Query qu=manager.createQuery(query);
		qu.setParameter("applicationId", applicationId);
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}
	
	@Override
	public boolean updateApplication(String interviewDate, int applicationId) {

		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="update Application ap set ap.interviewDate =:interviewDate where ap.applicationId =:applicationId ";

		Query qu=manager.createQuery(query);
		qu.setParameter("interviewDate", interviewDate);
		qu.setParameter("applicationId", applicationId);
		
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}


	@Override
	public List<Application> listAllApplications(int schProgramId) {

		EntityManager app=emf.createEntityManager();
		app.getTransaction().begin();
		String query="select ap from Application ap  where ap.schProgramId =:schProgramId";
		TypedQuery<Application> qu=app.createQuery(query,Application.class);
		qu.setParameter("schProgramId", schProgramId);
		List<Application> list=qu.getResultList();
		if(list!=null)
		{
			if(app!=null) {
				app.getTransaction().commit();
				app.close();
			}
			return list;
		}
		return null;
	}

	@Override
	public List<Participant> listParticipant(String emailId) {

		EntityManager Participant=emf.createEntityManager();
		Participant.getTransaction().begin();
		String query="select p from Participant p where p.emailId =:emailId";
		TypedQuery<Participant> qu= Participant.createQuery(query,Participant.class);
		qu.setParameter("emailId", emailId);
		List<Participant> list=qu.getResultList();
		if(list!=null)
		{
			if( Participant!=null) {
				Participant.getTransaction().commit();
				Participant.close();
			}
			return list;
		}
		return null;
	}
	
	@Override
	public boolean addParticipant(Participant p) {
		
		boolean state = false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}



	@Override
	public boolean deleteParticipant(int rollNo) {
		
		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="delete from Participant pa   where  pa.rollNo =:rollNo ";
			

		Query qu=manager.createQuery(query);
		qu.setParameter("rollNo", rollNo);
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean updateParticipant(Participant p) {
		
		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="update Participant p set  p.rollNo =:roll, p.emailId =:email, p.programmId =:program, p.applicationStatus =:status "
				+ " where  p.applicationId =:application";

		Query qu=manager.createQuery(query);
		qu.setParameter("roll", p.getRollNo());
		qu.setParameter("email", p.getEmailId());
		qu.setParameter("program", p.getProgrammId());
		qu.setParameter("status", p.getApplicationStatus());
		qu.setParameter("application", p.getApplicationId());
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}


	@Override
	public List<Participant> listAllParticipant() {
		EntityManager participant=emf.createEntityManager();
		participant.getTransaction().begin();
		String query="select p from Participant p";
		TypedQuery<Participant> qu= participant.createQuery(query,Participant.class);
		List<Participant> list=qu.getResultList();
		if(list!=null)
		{
			if( participant!=null) {
				participant.getTransaction().commit();
				participant.close();
			}
			return list;
		}
		return null;
	}
}
