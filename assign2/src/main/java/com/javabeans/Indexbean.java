package com.javabeans;

public class Indexbean {

	private String empid;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public Indexbean(String empid) {
		super();
		this.empid = empid;
	}

	public Indexbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Indexbean [empid=" + empid + "]";
	}
	
	
	
	
	
}
