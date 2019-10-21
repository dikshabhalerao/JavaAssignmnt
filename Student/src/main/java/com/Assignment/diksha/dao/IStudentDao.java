package com.Assignment.diksha.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import com.Assignment.diksha.dto.Student;
import com.Assignment.diksha.exception.StudentException;

public interface IStudentDao {

	boolean addStudent(Student student)	throws StudentException;
	Student removeStudent(int studentId)	throws StudentException;
	Student getStudentById(int studentId)	throws StudentException;
	
	ArrayList <Student> getAllStudent() throws StudentException;
	Student updateStudent(int studentId,String studentFirstName,
			String studentLastName, LocalDate studentBirthdate,
			String studentAddress)    throws StudentException;
}
