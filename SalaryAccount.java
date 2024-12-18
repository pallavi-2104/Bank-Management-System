package com.bank.account;

import java.time.LocalDate;
import java.time.Period;

public class SalaryAccount extends SavingsAccount {
	LocalDate lastTransactionDate;
	String status;
	
	
	public SalaryAccount() {
		super();
		this.lastTransactionDate = null;
		this.status = null;
		
	}
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public SalaryAccount(int accNo, String accHolderName, double balance, double interestRate,LocalDate lastTransactionDate, String status) {
		super(accNo,  accHolderName, balance,  interestRate);
		this.lastTransactionDate = lastTransactionDate;
		this.status = status;
	}
	
	public boolean withDraw(double amount)
	{
		System.out.println("Enter Current Date in YYYY-MM-DD ");
		String currentDate=sc.next();
		
		LocalDate currDate=LocalDate.parse(currentDate);
		
		if(checkStatus(currDate))
		{
			if(super.withDraw(amount))
			{
				this.setStatus("Active");
				this.lastTransactionDate=LocalDate.now();
				return true;
				
			}
		}
		System.out.println("Tansaction not performed more than 2 months");
		this.setStatus("Freeze");
		return false;
		
	}


	public boolean checkStatus(LocalDate currDate) {
		Period period=Period.between(currDate,this.lastTransactionDate);
		if(period.getDays()>=61)
		{
			return false;
		}
		return true;
	}
	
	
	

}
