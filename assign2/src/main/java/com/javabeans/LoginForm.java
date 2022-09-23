package com.javabeans;

public class LoginForm {

	
	private String empid;
	private String username;
	private String date;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public LoginForm(String empid, String username, String date) {
		super();
		this.empid = empid;
		this.username = username;
		this.date = date;
	}
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoginForm [empid=" + empid + ", username=" + username + ", date=" + date + "]";
	}
	
	
}
