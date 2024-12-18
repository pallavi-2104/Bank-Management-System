package com.bank.account;

import java.util.Scanner;

public  class SavingsAccount extends Account{
	
	 static double minimumBalance = 10000;
      Scanner sc=new Scanner(System.in);
     
     public SavingsAccount() 
     {
		super();
	 }
     
    
    public SavingsAccount(int accNo, String accHolderName, double balance, double interestRate) 
	{
		super(accNo,  accHolderName, balance,  interestRate);
		
	}
    
    public static double getMinimumBalance()
    {
    	return minimumBalance;
    }
    public static void setMinimunBalance(double minimumBalance)
    {
    	SavingsAccount.minimumBalance=minimumBalance;
    }



	@Override
	public boolean withDraw(double amount) {
		
		if(this.getBalance()-amount>=minimumBalance)
		{
			this.setBalance(this.getBalance()-amount);
			System.out.println("Successfully Withdraw");
			return true;
		}
		else
		{
			System.out.println("Sorry you can not withdraw money you have to keep atleast  "+minimumBalance+" in your Account");
			return false;
		}
		
		
	}





	@Override
	public void deposit(double amount)
	{
		
		this.setBalance(this.getBalance()+amount);
		System.out.println("Successfully Deposit");
		
		
	}





	@Override
	public void checkBalance()
	{
		System.out.println("Available Balance "+this.getBalance());
		
	}
	
	@Override
	public void calculateInterest() 
	{
	   System.out.println("How Many Month Your going to keep your money in our bank");
	   int month=sc.nextInt();
	   double interest=(this.getBalance()*this.getInterestRate()*month)/12;
	   System.out.println("Interest for "+month+" month on amount "+this.getBalance()+" is "+interest);
	   double totalInterest=this.getBalance()+interest;
	   System.out.println("Your Balance "+totalInterest);
	   
	}
    
}
