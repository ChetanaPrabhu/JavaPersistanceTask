package com.javabeans;

public class RegisterForm {
	private String empid;
	private String username;
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RegisterForm(String empid, String username, String email) {
		super();
		this.empid = empid;
		this.username = username;
		this.email = email;
	}
	public RegisterForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegisterForm [empid=" + empid + ", username=" + username + ", email=" + email + "]";
	}
	
	
	
}
