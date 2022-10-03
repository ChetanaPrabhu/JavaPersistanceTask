package com.manyToOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class College 
{
	@Id
	@GeneratedValue
private int collegeId;
private String collegeName;
@OneToMany(targetEntity=Student.class, mappedBy="collegeName",cascade=CascadeType.ALL, fetch = FetchType.EAGER)
List<Student> students;
public int getCollegeId() {
	return collegeId;
}
public void setCollegeId(int collegeId) {
	this.collegeId = collegeId;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
public College(int collegeId, String collegeName, List<Student> students) {
	super();
	this.collegeId = collegeId;
	this.collegeName = collegeName;
	this.students = students;
}
public College() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", students=" + students + "]";
}


}
