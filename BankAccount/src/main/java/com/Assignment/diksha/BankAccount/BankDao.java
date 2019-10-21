package com.Assignment.diksha.BankAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class BankDao {
	
public boolean addCustomerDetails(Bank bank) {
		
		String query="insert into bank_record (customer_name,customer_amount, deposite_date,customer_phone_no) values(?,?,?,?)";
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query))
		{
			statement.setString(1, bank.getCustomerName());
			statement.setDouble(2, bank.getAmount());
			statement.setString(3, bank.getDepositeDate());
			statement.setLong(4, bank.getCustomerPhoneNo());
		
			int count = statement.executeUpdate();
			if(count == 1)
				return true;
			
		}
			
		catch(Exception e){
			e.printStackTrace();
			}
				
		return false;
	}

public List<Bank> findAllCustomers() {
	
	String query = "SELECT * FROM Bank_record";
	List<Bank> customerlist = new ArrayList<>();
	
	try (Connection connection = DBUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultset = statement.executeQuery()) {
	
		
		while(resultset.next()) {
			Bank bank = new Bank(resultset.getInt(1), resultset.getString(2), resultset.getDouble(3), resultset.getString(4), resultset.getString(5),resultset.getLong(6));
			customerlist.add(bank);
		}			
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
	return customerlist ;

}

public Bank findCustomerById(int id) {
	String query = "SELECT * FROM Customers WHERE customer_id = " + id;	
	Bank Customer = null;
	
	try (Connection connection = DBUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultset = statement.executeQuery()) {
		
		if(resultset.next()) {
			Customer = 
					new Bank(resultset.getInt(1), resultset.getString(2), resultset.getDouble(3), resultset.getString(4), resultset.getString(5),resultset.getLong(6));
		}			
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
	return Customer;
}

public boolean deleteCustomer(int id) {
	
	Bank Customer = findCustomerById(id);
	if(Customer == null)
		return false;
	else {
		String query = "DELETE FROM Customers WHERE customer_id = " + id;
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			int count = statement.executeUpdate();
			if(count == 1)
				return true;				
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}		
	
}


   
}