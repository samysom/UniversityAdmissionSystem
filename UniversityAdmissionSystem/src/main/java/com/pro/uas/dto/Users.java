package com.pro.uas.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Users")
public class Users {
	
    @Id
    @Column(name= "Login_id")
	private String loginid;
    
    @Column(name= "Password")
	private String password;
    
    @Column(name= "Role")
	private String role;
    
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [loginid=" + loginid + ", role=" + role + "]";
	}
	
	
	
}