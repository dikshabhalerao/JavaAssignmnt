package com.Assignment.diksha.BankAccount;

public class Bank {
	
	private int customerId;
	private String customerName;
	private Double amount;
	private String DepositeDate;
	private String WithdrawDate;
	private long customerPhoneNo;
	
	public Bank() {
		super();
	}

	public Bank(int customerId, String customerName, Double amount, String depositeDate, String withdrawDate,
			long customerPhoneNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.amount = amount;
		this.DepositeDate = depositeDate;
		this.WithdrawDate = withdrawDate;
		this.customerPhoneNo = customerPhoneNo;
	}
	
	

	public Bank(String customerName, Double amount, String depositeDate, long customerPhoneNo) {
		super();
		this.customerName = customerName;
		this.amount = amount;
		this.DepositeDate = depositeDate;
		this.customerPhoneNo = customerPhoneNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDepositeDate() {
		return DepositeDate;
	}

	public void setDepositeDate(String depositeDate) {
		DepositeDate = depositeDate;
	}

	public String getWithdrawDate() {
		return WithdrawDate;
	}

	public void setWithdrawDate(String withdrawDate) {
		WithdrawDate = withdrawDate;
	}

	public long getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	public void setCustomerPhoneNo(long customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	@Override
	public String toString() {
		return "Bank [customerId=" + customerId + ", customerName=" + customerName + ", amount=" + amount
				+ ", DepositeDate=" + DepositeDate + ", WithdrawDate=" + WithdrawDate + ", customerPhoneNo="
				+ customerPhoneNo + "]";
	}
	
	

}
