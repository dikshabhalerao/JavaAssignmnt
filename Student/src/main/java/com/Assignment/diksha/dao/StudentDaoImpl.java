package com.Assignment.diksha.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import com.Assignment.diksha.connection.DBUtil;
import com.Assignment.diksha.dto.Student;
import com.Assignment.diksha.exception.StudentException;

public class StudentDaoImpl implements IStudentDao{
	
	

	@Override
	public boolean addStudent(Student student) throws StudentException {
		
		String query="insert into student(student_firstname,student_lastname,student_birthdate, student_address) values (?,?,?,?)";
		
		try(
			Connection conn=DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query))
		{
			
	//		Date bDate=student.getStudentBirthDate();
//			java.sql.Date date=java.sql.Date.valueOf(bDate);
			
			
			pstmt.setString(1, student.getStudentFirstName());
			pstmt.setString(2, student.getStudentLastName());
			pstmt.setDate(3,  student.getStudentBirthDate());
			pstmt.setString(4, student.getStudentAddress());
			
			int count =pstmt.executeUpdate();
			if(count==1)
				return true;
		}
		catch(SQLException exception){
			System.out.println(exception);
		}
		return false;
	}

	@Override
	public Student removeStudent(int studentId) throws StudentException {
		
		return null;
	}

	@Override
	public Student getStudentById(int studentId) throws StudentException {
		
		return null;
	}

	@Override
	public ArrayList<Student> getAllStudent() throws StudentException {
		
		return null;
	}

	@Override
	public Student updateStudent(int studentId, String studentFirstName, String studentLastName,
			LocalDate studentBirthdate, String studentAddress) throws StudentException {
		
		return null;
	}

}
