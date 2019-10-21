package com.Assignment.diksha.patient.model;

import java.sql.Date;

import com.Assignment.diksha.patientRecord.PatientDao;

public class PatientRecordJDBC {
	public static void main(String[] args) {
		
		PatientDao patientdao =new PatientDao();
		
		if(patientdao.addPatient(new Patient("Alex Browning", "Diabetis", 
				new Date(199,7,12),new Date(199,8,23),23000)))
			System.out.println("-- Employee Record added successfully --");
		else
			System.out.println("-- Failed to add record --");
		
		
	}

}
