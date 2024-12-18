package com.bank.account;

import java.util.Scanner;

public class CurrentAccount extends Account{
	 double limit=10000;
	 double overdraft=0;
	 Scanner sc=new Scanner(System.in);
	 
	 public CurrentAccount() {
		
	}
	 
	 

	
 
	public CurrentAccount(int accNo, String accHolderName, double balance, double interestRate) {
		super(accNo,  accHolderName, balance,  interestRate);
	}
	
	

	




	public double getLimit() {
		return limit;
	}





	public void setLimit(double limit) {
		this.limit = limit;
	}





	public double getOverdraft() {
		return overdraft;
	}





	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}





	@Override
	public boolean withDraw(double amount) {
		
		
		
		if(this.getBalance()>=amount)
		{
			this.setBalance(this.getBalance()-amount);
			System.out.println("Successfully Withdraw");
			return true;
		}
		else if(this.getBalance()==0)
		{
		    if(amount<=this.getLimit())        //you try to withdraw above balance if balance=0....Overdraft=0......limit=10000
			                               // remove money from limit
		    {
			this.setOverdraft(this.getOverdraft() + amount);
			this.setLimit(this.getLimit()-amount);
			System.out.println("Successfully Withdraw");
			System.out.println("Your Overdraf amount "+this.getOverdraft());
			return true;
		    }
		    else
		    {
			
			System.out.println("Sorry your Limit is over");
			return false;
		    }
		}
		
		else if(this.getLimit()+this.getBalance()>=amount)
		{
			this.setOverdraft(amount-this.getBalance());    //you try to withdraw above balance if balance=1000....Overdraft=0......limit=10000 
			this.setBalance(0);                             //withdraw =2000
			this.setLimit(this.getLimit()-this.getOverdraft()); // remove money from limit as well as balance
			System.out.println("Successfully Withdraw");
			return true;
		
		}
		else
		{
			System.out.println("Insufficient Balance");
			System.out.println("Your Overdraf amount "+this.getOverdraft());
			System.out.println("Pay amount to continue Trasaction");
			return false;
		}
		
		
	
		
		
	}

	@Override
	public void deposit(double amount) {
		
		
		if(this.getOverdraft()==0)        //balance=0
		{
			this.setBalance(this.getBalance()+amount);
			System.out.println("Successfully Deposit");
			
		}
		else if(this.getOverdraft()>0)
		{
			if(amount>=this.getOverdraft())
			{
				this.setLimit(this.getLimit()+this.getOverdraft());
				this.setBalance(amount-this.getOverdraft());
				this.setOverdraft(0);
				System.out.println("Successfully Deposit");
				
			}
			else
			{
				this.setOverdraft(this.getOverdraft()-amount);
				this.setLimit(this.getLimit()+amount);
				System.out.println("Successfully Deposit");
				
			}
		}
	
		
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Available Balance "+this.getBalance());
		
	}

	@Override
	public void calculateInterest() {
		System.out.println("No interest on current account");
		
	}

}
