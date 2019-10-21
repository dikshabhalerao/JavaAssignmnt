package com.Assignment.diksha.BankAccount;

import java.util.List;

public class BankRecordJDBC {
	
	public static void main(String[] args) {
		BankDao bankdao=new BankDao();
		
		if(bankdao.addCustomerDetails(new Bank("abhi", 2000.00, "1/05/2019", 2345660)))
				
			System.out.println("-- Customer Record added successfully --");
		else
			System.out.println("-- Failed to add record --");
		{
		List<Bank> customerlist = bankdao.findAllCustomers();
		for (Bank customer : customerlist) {
			System.out.println(customer);
		}
		}
	
//	Bank customerlist = bankdao.findEmployeeById(2);
//	if(employee != null)
//		System.out.println(employee);
//	else
//		System.out.println("-- Employee Record not found --");
	
//	if(dao.deleteEmployee(3)) 
//		System.out.println(" -- Employee Record deleted successfully --");
//	else
//		System.out.println(" -- Failed to load record --");
	
	
	
	
}

	}

