package com.demoJPA;

public class Person {

	private int personId;
	private String personName;
	private String location;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Person(int personId, String personName, String location) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.location = location;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", location=" + location + "]";
	}
	
	
	
	
	
}
