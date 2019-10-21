package com.Assignment.diksha.pl;


import java.sql.Date;

import com.Assignment.diksha.dao.StudentDaoImpl;
import com.Assignment.diksha.dto.Student;
import com.Assignment.diksha.exception.StudentException;

public class StudentValues {

	
	public static void main(String[] args) throws StudentException {
		
		StudentDaoImpl studentDao=new StudentDaoImpl();
		//DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate bdate = LocalDate.parse(date, format);
		if(studentDao.addStudent(new Student("Diksha", "Bhalerao",new Date(119, 9, 7),"Mumbai")))
			System.out.println("-- Employee Record added successfully --");
		
	else
			System.out.println("-- Failed to add record --");
		
	}
	

}
