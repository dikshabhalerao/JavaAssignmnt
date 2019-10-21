package com.Assignment.diksha.patient.model;

import java.sql.Date;

public class Patient {
	
	private int patientId;
	private String patientName;
	private String patientDisease;
	private Date patientAdmitDate;
	private Date patientDischargeDate;
	private double patientBill;
	
	
	public Patient() {
		super();
	}
	
	public Patient(int patientId, String patientName, String patientDisease, Date patientAdmitDate,
			Date patientDischargeDate, double patientBill) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientDisease = patientDisease;
		this.patientAdmitDate = patientAdmitDate;
		this.patientDischargeDate = patientDischargeDate;
		this.patientBill = patientBill;
	}




	public Patient(String patientName, String patientDisease, Date patientAdmitDate, Date patientDischargeDate,
			double patientBill) {
		super();
		this.patientName = patientName;
		this.patientDisease = patientDisease;
		this.patientAdmitDate = patientAdmitDate;
		this.patientDischargeDate = patientDischargeDate;
		this.patientBill = patientBill;
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public String getPatientDisease() {
		return patientDisease;
	}


	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}


	public Date getPatientAdmitDate() {
		return patientAdmitDate;
	}


	public void setPatientAdmitDate(Date patientAdmitDate) {
		this.patientAdmitDate = patientAdmitDate;
	}


	public Date getPatientDischargeDate() {
		return patientDischargeDate;
	}


	public void setPatientDischargeDate(Date patientDischargeDate) {
		this.patientDischargeDate = patientDischargeDate;
	}


	public double getPatientBill() {
		return patientBill;
	}


	public void setPatientBill(double patientBill) {
		this.patientBill = patientBill;
	}


	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientDisease=" + patientDisease
				+ ", patientAdmitDate=" + patientAdmitDate + ", patientDischargeDate=" + patientDischargeDate
				+ ", patientBill=" + patientBill + "]";
	}
	
	
	

}
