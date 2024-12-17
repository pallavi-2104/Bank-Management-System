package com.account.managment;
import java.time.LocalDate;
import java.util.Scanner;
import com.bank.account.*;

public class AccountManagement {
	Account[] acc_arr=new Account[100];
	Transaction[] tran_arr=new Transaction[1000];
	static int count=-1;
	static int tcount=-1;
	static int accNo=123456;
	static int tranId=1234;
	Scanner sc=new Scanner(System.in);
	Account acc;
	Transaction tran;
	
	
	public void createAccount()
	{
		System.out.println("\n\n");
		System.out.println("====++=========+++==========+++=========++=========");
		System.out.println("|                    **Bank Management System***         |");
		System.out.println("===================================================");
		System.out.printf("| %-8s |      %-29s     |%n","Choice","Account Type");
		System.out.println("---------------------------------------------------");
		System.out.println("===================================================");
		System.out.printf("| %-8s |      %-29s     |%n","1","Saving Account");
		System.out.printf("| %-8s |      %-29s     |%n","2","Salary Account");
		System.out.printf("| %-8s |      %-29s     |%n","3","Current Account");
		System.out.printf("| %-8s |      %-29s     |%n","4","Loan Account");
		System.out.println("===================================================");
	
		int accType=sc.nextInt();
		
		switch(accType)
		{
		
		   case 1:
		   {   int ch=1;
		       do
		       {
			   System.out.println("Enter your Name");
			   sc.nextLine();
			   String accHolderName=sc.nextLine();
			   
			   System.out.println("Enter Amount you want to deposit for creation of account atleast you have to deposit 100000");
			   double balance=sc.nextDouble();
			   if(balance>=10000)
			   {
				   acc=new SavingsAccount(accNo++,accHolderName,balance,3.5);//3.5 rateOfInterest
				   acc_arr[++count]=acc;
				   tran_arr[++tcount]=new Transaction(acc.getAccNo(),tranId++,"Saving Account Created",balance,balance);
				
				   
				   
				   System.out.println("Your Account is created successfully");
				   System.out.println("Your Account No "+acc.getAccNo());
				   break;
				  
			   }else
			   {
				   System.out.println("Your deposited amount is less to create saving account atleast you have to deposit 100000 ");
				   System.out.println("Please deposit atleast "+SavingsAccount.getMinimumBalance()+" to open your account\n\n\n");
				  
			   }
			   System.out.println("Do you want to continue");
			   System.out.println("1.Yes\n2.No");
			   ch=sc.nextInt();
		       }while(ch!=2);
			   
		   }
		   break;
		   case 2:
		   {
			   int ch=1;
		       do
		       {
			   System.out.println("Enter your Name");
			   sc.nextLine();
			   String accHolderName=sc.nextLine();
			 
			   
			   System.out.println("Enter Amount you want to deposit for creation of account atleast you have to deposit 100000");
			   double balance=sc.nextDouble();
			   if(balance>=10000)
			   {
				   acc=new SalaryAccount(accNo++,accHolderName,balance,3.5,LocalDate.now(),"Active");//3.5 rateOfInterest
				   acc_arr[++count]=acc;
				   tran_arr[++tcount]=new Transaction(acc.getAccNo(),tranId++,"Salary Account Created",balance,balance);
				   
			
				   System.out.println("Your Account is created successfully");
				   System.out.println("Your Account No "+acc.getAccNo());
				   break;
			   }else
			   {
				   System.out.println("Your deposited amount is less to create salary account");
				   System.out.println("Please deposit atleast "+SavingsAccount.getMinimumBalance()+" to open your account\n\n\n");
			   }
			   System.out.println("Do you want to continue");
			   System.out.println("1.Yes\n2.No");
			   ch=sc.nextInt();
		       }while(ch!=2);
			   
		   }
		   break;
		   case 3:
		   {
			   System.out.println("Enter your Name");
			   sc.nextLine();
			   String accHolderName=sc.nextLine();
			   
			   System.out.println("Enter Amount you want to deposit for creation of account");
			   double balance=sc.nextDouble();
			   
				   acc=new CurrentAccount(accNo++,accHolderName,balance,0);
				   acc_arr[++count]=acc;
				   tran_arr[++tcount]=new Transaction(acc.getAccNo(),tranId++,"Current Account Created",balance,balance);
				  
				   
				   System.out.println("Your Account is created successfully");
				   System.out.println("Your Account No "+acc.getAccNo());
			   
			   
		   }
		   break;
		   case 4:
		   {
			   System.out.println("Enter your Name");
			   sc.nextLine();
			   String accHolderName=sc.nextLine();
			   
			   System.out.println("How much amount you want as loan");
			   double amount=sc.nextDouble();
			   double balance=amount+0.08*amount;
			   acc=new  LoanAccount(accNo++,accHolderName,balance,0.08);
			   acc_arr[++count]=acc;
			   tran_arr[++tcount]=new Transaction(acc.getAccNo(),tranId++,"Loan Account Created",amount,0-balance);
			   
			  
				   System.out.println("Your Account is created successfully");
				   System.out.println("Your Account No "+acc.getAccNo());
			   
		   }
		   break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void counterActivities()
	{
		System.out.println("\n\n");
		System.out.println("===================================================");
		System.out.println("|                    Process                       |");
		System.out.println("===================================================");;
		System.out.printf("| %-8s |      %-29s     |%n","Choice","Activities");
		System.out.println("===================================================");
		System.out.printf("| %-8s |      %-29s     |%n","1","Withdraw Money");
		System.out.printf("| %-8s |      %-29s     |%n","2","Deposit Money");
		System.out.printf("| %-8s |      %-29s     |%n","3","Check Balance");
		System.out.printf("| %-8s |      %-29s     |%n","4","Calculate Interest");
		System.out.println("===================================================");
		System.out.println("\n\n");
		
		System.out.println("Which Operation you want to perform");
		
		int choice=sc.nextInt();
		switch(choice)
		{   
		   //withdraw
         	case 1:
			{
			System.out.println("Enter Account Number");
				int accNo=sc.nextInt();
				int accNoFound=0;
				System.out.println("Enter Amount");
				double amount=sc.nextDouble();
				for(int i=0;i<=count;i++)
				{
					
						if(acc_arr[i].getAccNo()==accNo)
						{
							acc_arr[i].withDraw(amount);
							
							tran_arr[++tcount]=new Transaction(acc.getAccNo(),++tranId,"Withdraw",amount,acc_arr[i].getBalance());
							accNoFound=1;
						}
						
					
				}
				if(accNoFound!=1)
				{
					System.out.println("Account does not found ");
					System.out.println("Check Account number");
				}
				
			}
			break;

		
		//Deposit
		case 2:
		{

				System.out.println("Enter Account Number");
				int accNo=sc.nextInt();
				System.out.println("Enter Amount");
				double amount=sc.nextDouble();
				int accNoFound=0;
				
				for(int i=0;i<=count;i++)
				{

						if(acc_arr[i].getAccNo()==accNo)
						{
							acc_arr[i].deposit(amount);
							tran_arr[++tcount]=new Transaction(acc.getAccNo(),++tranId,"Deposit",amount,acc_arr[i].getBalance());
							accNoFound=1;
						}
						
					
				}
				if(accNoFound!=1)
				{
					System.out.println("Account does not found ");
					System.out.println("Check Account number");
				}
			}
			break;

		//Balance
		case 3:
		{

				System.out.println("Enter Account Number");
				int accNo=sc.nextInt();
				int accNoFound=0;
				for(int i=0;i<=count;i++)
				{

						if(acc_arr[i].getAccNo()==accNo)
						{
							acc_arr[i].checkBalance();
							accNoFound=1;
						}
						
					
				}
				if(accNoFound!=1)
				{
					System.out.println("Account does not found ");
					System.out.println("Check Account number");
				}
			}
			break;
		//Interest
		case 4:
		{

				System.out.println("Enter Account Number");
				int accNo=sc.nextInt();
				int accNoFound=0;
				for(int i=0;i<=count;i++)
				{
				
						if(acc_arr[i].getAccNo()==accNo)
						{
							acc_arr[i].calculateInterest();
							accNoFound=1;
						}
						

				}
				if(accNoFound!=1)
				{
					System.out.println("Account does not found ");
					System.out.println("Check Account number");
				}
			}
			break;


    }
	}
	
	
	
	public void   closeAccount()
	{
		System.out.println("Enter Account Number");
		int accNo=sc.nextInt();
		int accNoFound=0;
		for(int i=0;i<=count;i++)
		{

				if(acc_arr[i].getAccNo()==accNo)
				{
					double amount=acc_arr[i].getBalance();
					//acc_arr[i].withDraw(amount);
	
					accNoFound=1;
					for(int j=i;j<count;j++)
					{
						acc_arr[j]=acc_arr[j+1];
						tran_arr[++tcount]=new Transaction(acc.getAccNo(),++tranId,"Account Deleted",0,0);
					}
					break;
					
					
					
				}
				

		}
		
		if(accNoFound!=1)
		{
			System.out.println("Account does not found ");
			System.out.println("Check Account number");
		}
		else
		{
			System.out.println("Account sucessfully deleted");
			count--;
		
		}
	}
	
	
	public void generateReport()
	{
			  System.out.println("\n\n");
			  System.out.println("==========================================================================================================");
			  System.out.println("                                          DAILY TRANSACTION REPORT                                        ");
			  System.out.println("==========================================================================================================");
			  System.out.printf("%10s %12s %27s %15s %17s", "TRANSACTION NO",   "ACCOUNT NO",  "TRANSACTION TYPE", "AMOUNT", "TOTAL BALANCE");
			  System.out.println();
			  System.out.println("==========================================================================================================");
			  
			  for(int i=0; i<=tcount; i++) 
			  {
			   System.out.format("%9s %10s %35s %15s %17s", tran_arr[i].getTranId(),tran_arr[i].getAccNo(), tran_arr[i].getTransactionType(), tran_arr[i].getAmount(),tran_arr[i].getBalance());
			   System.out.println();
			 
			   System.out.println("-------------------------------------------------------------------------------------------------------- ");
			  }
			  System.out.println("==========================================================================================================");
			  
			 
	}
}
