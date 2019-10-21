package com.Assignment.diksha.dto;

import java.sql.Date;

public class Student {
	
	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private Date studentBirthDate;
	private String studentAddress;
	
	public	Student(){}

	public Student(int studentId, String studentFirstName, String studentLastName, Date studentBirthDate,
			String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentBirthDate = studentBirthDate;
		this.studentAddress = studentAddress;
	}

	

	public Student(String studentFirstName, String studentLastName, java.util.Date studentBirthDate, String studentAddress) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentBirthDate = (Date) studentBirthDate;
		this.studentAddress = studentAddress;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public Date getStudentBirthDate() {
		return studentBirthDate;
	}

	public void setStudentBirthDate(Date studentBirthDate) {
		this.studentBirthDate = studentBirthDate;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentBirthDate=" + studentBirthDate + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	
	
	

}
