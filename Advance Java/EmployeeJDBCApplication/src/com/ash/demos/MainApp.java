package com.ash.demos;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int choice;
		EmployeeManagement empMgr=new EmployeeManagement();
		do {
			System.out.println("\n---------EMPLOYEE MANAGEMENT SYSTEM-------\n");
			System.out.println("1.Add Employee");
			System.out.println("2.Search Employee(By Id)");
			System.out.println("3.Update Employee(By Id)");
			System.out.println("4.Delete Employee(By Id)");
			System.out.println("5.Display Employee(All");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				empMgr.addEmp();
				break;
			}
			case 2:
			{
				empMgr.searchEmp();
				break;
			}
			case 3:
			{
				empMgr.updateEmp();
				break;
			}
			case 4:
			{
				empMgr.deleteEmp();
				break;
			}
			case 5:
			{
				empMgr.displayAll();
				break;
			}
			case 6:
			{
				System.out.println("......Exiting......");
				break;
			}
			default:
			{
				System.out.println("-------Invalid Choice------");
			}
			}
		}while(choice!=6);
	
		
	}

}
