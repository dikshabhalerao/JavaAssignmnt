package com.Assignment.diksha.patientRecord;


import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Assignment.diksha.patient.model.DBUtil;
import com.Assignment.diksha.patient.model.Patient;


public class PatientDao {
	
public boolean addPatient(Patient patient) {
		
		String query="insert into patient_record (patient_name,patient_disease, patient_admit_date, patient_discharge_date,patient_bill) values(?,?,?,?,?)";
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setString(1, patient.getPatientName());
			statement.setString(2, patient.getPatientDisease());
			statement.setDate(3, patient.getPatientAdmitDate());
			statement.setDate(4, patient.getPatientDischargeDate());
			statement.setDouble(5, patient.getPatientBill());
			
			int count = statement.executeUpdate();
			if(count == 1)
				return true;
			
		}
			
		catch(Exception e){
			e.printStackTrace();
			}
				
		return false;
		
	}

}
