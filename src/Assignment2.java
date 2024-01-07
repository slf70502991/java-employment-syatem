/**
* A brief description of the role of this class
* Student Name: YENLING, LIN
* Student Number: 041107273
* Course: CST8132 Object Oriented Programming
* Program: CET-CS-Level 2
* Professor: Rejaul Chowdhury 
* */

import java.util.Scanner;

public class Assignment2{
	public static void main(String[] args) {
		//Fetch the employee list by this object
		EmployeeList el = new EmployeeList();
		
		System.out.println("====== Welcome to the Employee Management System ======");

		String option;
		boolean status = true;
		Scanner input = new Scanner(System.in);
		
		do {
			//The main menu
			System.out.println("a: Add a new employee (Management/Development)");
			System.out.println("u: Update email address of an employee");
			System.out.println("d: Display the employees supervised by a Team Manager");
			System.out.println("p: Print the info of all employees");
			System.out.println("m: Run monthly payroll");
			System.out.println("s: Search an enployee");
			System.out.println("r: Remove a list of employee");
			System.out.println("e: Promote an enployee");
			System.out.println("q: Quit");
			System.out.println();
			
			System.out.println("Enter your option: ");
			
			option = input.next();
			switch(option) {
			case "a":
				System.out.printf("Enter the details of employee %d\n",el.ManagerList.size()+ el.DeveloperList.size()+1);
				System.out.println("=========================");
				el.addEmployee(input);
				
				break;
			case "u":
				el.updateEmail(input);
				break;
			case "p":
				el.printEmployeeDetails();
				break;
			case "d":
				el.displayTeamEmployee(input);
				break;
			case "m":
				el.monthlyPayroll();
				break;
			case "s":
				el.searchEmployee(input);
				break;
			case "e":
				el.promoteEmployee(input);
				break;
			case "r":
				el.removeEmployee(input);
				
				break;
			case "q":
				System.out.println("Successfully exitted the program.");
				status = false;
				break;
			}
		}while(status==true);
		input.close();
	}
}