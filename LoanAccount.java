package com.bank.account;



import java.util.Scanner;

public class LoanAccount extends Account {

	double loanPaid;
	double loanGiven;
	Scanner sc=new Scanner(System.in);
	
	
	
	public LoanAccount() {
		
		
	}
	public LoanAccount(int accNo, String  accHolderName, double balance, double interestRate) {
		super(accNo,  accHolderName, 0-balance,  interestRate);
		this.loanPaid = 0;
		this.loanGiven = balance;
	}
	

	

	
	
public double getLoanPaid() {
		return loanPaid;
	}

	public void setLoanPaid(double loanPaid) {
		this.loanPaid = loanPaid;
	}

	public double getLoanGiven() {
		return loanGiven;
	}

	public void setLoanGiven(double loanGiven) {
		this.loanGiven = loanGiven;
	}

	

	
	public void deposit(double amount) {

		if(this.getBalance() < 0)
		{
			if( (this.getBalance() + amount) <= 0)
			{
				this.setBalance(this.getBalance()+amount);
				this.setLoanPaid(this.getLoanPaid()+amount);
				System.out.println("Deposit successful");
				
				
			}
			else
			{
				System.out.println("your paying more than your loan");
				System.out.println("You have to pay "+(0-this.getBalance()));
			}
		}
		else
		{
			System.out.println("You already paid your laon");
			this.setBalance(0);
		}
		
	}
	

	@Override
	public  boolean withDraw(double amount) {

		if(this.getBalance()==0)
		{
			 amount=amount+this.getInterestRate()*amount;
			 this.setBalance(this.getBalance()-amount);
			this.setLoanGiven(amount);
			this.setLoanPaid(0);
			System.out.println("Withdraw successful");
			return true;
			
		}
		else
		{
			System.out.println("Pay the loan to take second loan");
			return false;
			
		}
	}


	@Override
	public void checkBalance()
	{
		
		System.out.println("Loan given is with "+this.getInterestRate()+" of rate of interest is "+this.loanGiven);
		System.out.println("Amount paid "+this.loanPaid);
		System.out.println("Balance "+this.getBalance());
		
		
	}


	@Override
	public void calculateInterest() {
		
		 double interest=(this.getBalance()*this.getInterestRate())/12;
		   System.out.println("Interest for one year on amount "+this.getBalance()+" is "+interest);
		   double totalInterest=this.getBalance()+interest;
		   System.out.println("Your Balance "+totalInterest);
		
		
	}
	
	
	
}
