package com.pro.uas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.pro.uas.config.URL;
import com.pro.uas.dto.Application;
import com.pro.uas.dto.Participant;
import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.dto.Users;

public class UniversityDAOJDBCImpl implements UniversityManagementDAO {

	PreparedStatement pstmt = null;
	Connection con = null;
	URL url = new URL();
	
	ProgrammsScheduled ps = new ProgrammsScheduled();
	ResultSet rs = null;
	Users us = new Users();
	Statement stmt = null;
	List<ProgramsOffered> lst=new LinkedList<ProgramsOffered>();
	List<ProgrammsScheduled> lst1=new LinkedList<ProgrammsScheduled>();
	List<Participant> lst3=new LinkedList<Participant>();
	
	
	
	@Override
	public Users login(String loginid, String password, String role) {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection(url.getURL());
		
		String query = "select * from Users where Login_id = ? and Password = ? and  Role=?";
		pstmt = con.prepareStatement(query);
		pstmt.setString(1,loginid);
		pstmt.setString(2,password);
		pstmt.setString(3,role);
		
		rs = pstmt.executeQuery();
		if(rs.next())
		{
			String id1 = rs.getString("Login_id");
			String name = rs.getString("Role");
			
			us.setLoginid(id1);
			us.setRole(name);
			
			return us;
			
		}
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		   	
		}
		finally
		{
            if(con!=null)
            {
            	try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            if(pstmt!=null)
            {
            	try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            if(rs!=null)
            {
            	try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
		}
		return null;
	}


	@Override
	public boolean addProgramOffered(ProgramsOffered po) {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url.getURL());
		
		String query = "insert into Programs_Offered values(?,?,?,?,?)";
		pstmt = con.prepareStatement(query);
		pstmt.setString(1,po.getProgramName());
		pstmt.setString(2,po.getDescription());
		pstmt.setString(3,po.getEligibility());
		pstmt.setInt(4,po.getDuration());
		pstmt.setString(5,po.getDegreecertificateOffered());
		
		int count = pstmt.executeUpdate();
		if(count>0)
		{
			return true;
		}
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		    return false;   
		}
		return false;
	}
		

	@Override
	public boolean  deleteProgramOffered(String programName) {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url.getURL());
		
		String query = "delete from Programs_Offered where ProgramName = ?";
		pstmt = con.prepareStatement(query);
		pstmt.setString(1, programName);
		int count = pstmt.executeUpdate();
		if(count>0)
		{
			return true;
		}
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		    return false;
		}
		return false;

	}

	@Override
	public List<ProgramsOffered> listAllPrograms() {
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url.getURL());
			
            String query="SELECT * FROM Programs_Offered";
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);

			while(rs.next()) 
			{    
				ProgramsOffered po = new ProgramsOffered();
				po.setProgramName(rs.getString(1));
				po.setDescription(rs.getString(2));
				po.setEligibility(rs.getString(3));
				po.setDuration(rs.getInt(4));
				po.setDegreecertificateOffered(rs.getString(5));
				
				lst.add(po);
				return lst;
			}

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) 
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) 
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public boolean createScheduledProgram(ProgrammsScheduled Ps1) {
		
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url.getURL());
				
				String query = "insert into programms_scheduled values(?,?,?,?,?,?)";
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1,Ps1.getScheduledProgramId());
				pstmt.setString(2,Ps1.getProgrammName());
				pstmt.setString(3,Ps1.getLocation());
				pstmt.setString(4,Ps1.getStartDate());
				pstmt.setString(5, Ps1.getEndDate());
				pstmt.setInt(6, Ps1.getSessionsPerWeek());
				
			int count = pstmt.executeUpdate();
			
			if(count>0)
			{
				System.out.println("hiii");
				return true;
			}
			}
			catch(Exception e)
			{
			    e.printStackTrace();
			    return false;   
			}
			return false;
	}

	
	@Override
	public boolean updateScheduledProgram(ProgrammsScheduled Ps) {
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
	
			con = DriverManager.getConnection(url.getURL());
			
			String querry="UPDATE ums SET   ProgrammName=? , Location=? ,  Start_date=? ,  End_date=? ,  Sessions_per_week=?"
					+ " WHERE  Scheduled_program_id=?";
					
			pstmt = con.prepareStatement(querry);
			pstmt.setString(1,ps.getProgrammName());
			pstmt.setString(2,ps.getLocation());
			pstmt.setString(3,ps.getStartDate());
			pstmt.setString(4,ps.getEndDate());
			pstmt.setInt(5,ps.getSessionsPerWeek());
			pstmt.setInt(6,ps.getScheduledProgramId());
			
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				return true;
			
			}		
		}catch(Exception e)
		{
		
			e.printStackTrace();
			return false;
		}
		return false;
	}
	

	@Override
	public boolean deleteScheduledProgram(int schProgrammId) {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url.getURL());
		String query = "delete from Programms_Scheduled where Scheduled_program_id = ?";
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1,schProgrammId );
		int count = pstmt.executeUpdate();
		if(count>0)
		{
			return true;
		}
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		    return false;
		}
		return false;

	}


	@Override
	public List<ProgrammsScheduled> listAllScheduledPrograms(String programName) {
		
		List<ProgrammsScheduled> lst1=new ArrayList<ProgrammsScheduled>();
		
		try 
		{
			String query="SELECT * FROM Programms_Scheduled";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);


			while(rs.next()) 
			{    
			
				ps.setScheduledProgramId(rs.getInt("Scheduled_program_id"));
				ps.setProgrammName(rs.getString("ProgrammName"));
				ps.setLocation(rs.getString("Location"));
				ps.setStartDate(rs.getString("Start_date"));
				ps.setEndDate(rs.getString("End_date"));
				ps.setSessionsPerWeek(rs.getInt("Sessions_per_week"));
				
				
				
				lst1.add(ps);
			}

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) 
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) 
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
		

	@Override
	public boolean applyApplication(Application ap) {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url.getURL());
		
		String query = "insert into Application values(?,?,?,?,?,?,?,?,?,?)";
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1,ap.getApplicationId());
		pstmt.setString(2,ap.getFullName());
		pstmt.setString(3,ap.getDateOfBirth());
		pstmt.setString(4,ap.getHishestQualification());
		pstmt.setInt(5,ap.getMarksObtained());
		pstmt.setString(6,ap.getGoals());
		pstmt.setString(7,ap.getEmailId());
		pstmt.setInt(8,ap.getSchProgramId());
		pstmt.setString(9,ap.getStatus());
		pstmt.setString(10,ap.getInterviewDate());
		
		
		int count = pstmt.executeUpdate();
		if(count>0)
		{
			return true;
		}
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		    return false;   
		}
		return false;
	}
		

	@Override
	public boolean deleteApplication(int applicationid) {

		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection(url.getURL());
		
		String query = "delete from Application where Application_id = ?";
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1, applicationid);
		
		int count = pstmt.executeUpdate();
		if(count>0)
		{
			return true;
		}
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		    return false;
		}
		return false;
	}

	@Override
	public boolean updateApplication(String interviewdate, int applicationid) {
		
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			con = DriverManager.getConnection(url.getURL());
			
			String querry="UPDATE Application SET  Date_of_interview=?"
					+ " WHERE  applicationid=?";
					
					
			pstmt=con.prepareStatement(querry);
			pstmt.setString(1,interviewdate);
			pstmt.setInt(2,applicationid);
			
			
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				return true;
			
			}		
		}catch(Exception e)
		{
		
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@Override
	public List<Application> listAllApplications(int schProgramId) {
		
		List<Application> lst2=new ArrayList<Application>();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");			
			con = DriverManager.getConnection(url.getURL());
			String query="SELECT * FROM Application where ";
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);
			
				while (rs.next()) {
					Application ap = new Application();
					ap.setApplicationId(rs.getInt(1));
					ap.setFullName(rs.getString(2));
					ap.setDateOfBirth(rs.getString(3));
					ap.setHishestQualification(rs.getString(4));
					ap.setMarksObtained(rs.getInt(5));
					ap.setGoals(rs.getString(6));
					ap.setEmailId(rs.getString(7));
					ap.setSchProgramId(rs.getInt(8));
					ap.setStatus(rs.getString(9));
					ap.setInterviewDate(rs.getString(10));
					lst2.add(ap);
					
				}
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lst2;
	}

		

	@Override
	public List<Participant> listParticipant(String emailId) {
		
		try
		{
		
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url.getURL());

			String query = "select * from Application where Email_id=? ";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,emailId);
			rs = pstmt.executeQuery();

			while(rs.next())
			{
				int no = rs.getInt("applicationid");
				
				System.out.println(no);
				
				System.out.println("***************");

			}
		
		}catch(Exception e)
		{
			
		   e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean updateProgramOffered(ProgramsOffered po) {
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
	
			con = DriverManager.getConnection(url.getURL());
			
			pstmt = con.prepareStatement("update Programs_Offered set Description = ?,  Applicant_eligibility = ?, "
					+ "Duration = ?, Degree_certificate_offered = ?  where ProgramName = ?");
			
     		pstmt.setString(1,po.getDescription());
			pstmt.setString(2,po.getEligibility());
			pstmt.setInt(3,po.getDuration());
			pstmt.setString(4,po.getDegreecertificateOffered());
			pstmt.setString(5,po.getProgramName());
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				return true;
			
			}		
		}catch(Exception e)
		{
		
			e.printStackTrace();
			return false;
		}
		return false;
	}


	@Override
	public boolean addParticipant(Participant p) {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url.getURL());
		
		String query = "insert into Participants values(?,?,?,?,?)";
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1,p.getRollNo());
		pstmt.setString(2,p.getEmailId());
		pstmt.setInt(3,p.getApplicationId());
		pstmt.setInt(4,p.getProgrammId());
		pstmt.setString(5,p.getApplicationStatus());
		
		int count = pstmt.executeUpdate();
		if(count>0)
		{
			return true;
		}
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		    return false;   
		}
		return false;
	}
		

	@Override
	public boolean deleteParticipant(int rollNo) {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url.getURL());
		
		String query = "delete from Participant where Roll_no = ?";
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1, rollNo);
		int count = pstmt.executeUpdate();
		if(count>0)
		{
			return true;
		}
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		    return false;
		}
		return false;

	}

	@Override
	public boolean updateParticipant(Participant p) {
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
	
			con = DriverManager.getConnection(url.getURL());
			
			pstmt = con.prepareStatement("update Participants set Roll_no = ?, Email_id = ?, "
					+ "Scheduled_program_id = ?, Application_Status = ?  where ProgramName Application_id = ?");
			
     		pstmt.setInt(1,p.getRollNo());
			pstmt.setString(2,p.getEmailId());
			pstmt.setInt(3,p.getProgrammId());
			pstmt.setString(4,p.getApplicationStatus());
			pstmt.setInt(5,p.getApplicationId());
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				return true;
			
			}		
		}catch(Exception e)
		{
		
			e.printStackTrace();
			return false;
		}
		return false;
	}



	@Override
	public List<Participant> listAllParticipant() {
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url.getURL());
			
            String query="SELECT * FROM Participants";
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);

			while(rs.next()) 
			{    
				Participant p = new Participant();
				p.setRollNo(rs.getInt(1));
				p.setEmailId(rs.getString(2));
				p.setApplicationId(rs.getInt(3));
				p.setProgrammId(rs.getInt(4));
				p.setApplicationStatus(rs.getString(5));
				
				lst3.add(p);
				return lst3;
			}

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) 
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) 
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}


	

	
}	
	