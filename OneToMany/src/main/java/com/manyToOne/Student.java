package com.manyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student
{
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	@ManyToOne
	@JoinColumn(name = "college_id")
	private College collegeName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public College getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(College collegeName) {
		this.collegeName = collegeName;
	}

	public Student(int studentId, String studentName, College collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeName = collegeName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collegeName=" + collegeName
				+ "]";
	}

}
