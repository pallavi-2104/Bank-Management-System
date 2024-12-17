package com.account.managment;

public class Transaction {
	int accNo;
	int tranId;
	String transactionType;
	double amount;
	double balance;
	final String username="pallavi2104";
	final String password="ps@123";
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public Transaction(int accNo, int tranId, String transactionType,double amount, double balance) {
		super();
		this.accNo = accNo;
		this.tranId = tranId;
		this.transactionType = transactionType;
		this.amount=amount;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getTranId() {
		return tranId;
	}
	public void setTranId(int tranId) {
		this.tranId = tranId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [accNo=" + accNo + ", tranId=" + tranId + ", transactionType=" + transactionType
				+ ", amount=" + amount + ", balance=" + balance + "]";
	}
	
	
	
	
	

}
