package com.account.managment;

import java.util.Scanner;

public class MainApp {
	static Scanner sc=new Scanner(System.in);
	static AccountManagement am=new AccountManagement();

	public static void main(String[] args) {
		int ch;
		do
		{
			System.out.println("\n\n");
			System.out.println("==========================================================");
			System.out.println("|                    **Process**                             |");
			System.out.println("==========================================================");
			System.out.printf("| %-8s |      %-35s     |%n","Choice","Activities");
			System.out.println("==========================================================");
			System.out.printf("| %-8s |      %-35s     |%n","1","Account Open");
			System.out.printf("| %-8s |      %-35s     |%n","2","Counter Activities");
			System.out.printf("| %-8s |      %-35s     |%n","3","Report for daily transactions");
			System.out.printf("| %-8s |      %-35s     |%n","4","Account Close");
			System.out.printf("| %-8s |      %-35s     |%n","5","Exit");
			System.out.println("==========================================================");
			System.out.println("\n\n");
			
			System.out.println("What do you want to perform");
			 ch=sc.nextInt();
			 switch(ch)
			 {
			 case 1:
			 {
				 am.createAccount();
			 }
			 break;
			 case 2:
			 {
				 am.counterActivities();
			 }
			 break;
			 case 3:
			 {
				 am.generateReport();
			 }
			 break;
			 case 4:
			 {
				 am.closeAccount();
			 }
			
			 }
		}while(ch!=5);
		

	}

}
