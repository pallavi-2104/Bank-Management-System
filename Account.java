package com.bank.account;

import java.util.Arrays;

public abstract  class Account {
	private int accNo;
	private String accHolderName;
	private double balance;
	private double interestRate;
	
	public Account() {
		this.accNo =0;
		this.accHolderName = null;
		this.balance = 0;
		this.interestRate = 0;
	}
	
	
	
	
	public Account(int accNo, String accHolderName, double balance, double interestRate) {
		
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.interestRate = interestRate;
	}




	public int getAccNo() {
		return accNo;
	}




	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}




	public String getAccHolderName() {
		return accHolderName;
	}




	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	public double getInterestRate() {
		return interestRate;
	}




	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

 
	


	@Override
	public String toString() {
		return "Account Number=" + accNo + "\nAccount Holder Name=" + accHolderName + "\nBalance=" + balance
				+ "\ninterestRate=" + interestRate  ;
	}


   
    public abstract boolean withDraw(double amount);
    public abstract void deposit(double amount);
    public abstract void checkBalance();
	public abstract void calculateInterest();




	
}
