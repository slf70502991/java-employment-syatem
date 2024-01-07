/**
* A brief description of the role of this class
* Student Name: YENLING, LIN
* Student Number: 041107273
* Course: CST8132 Object Oriented Programming
* Program: CET-CS-Level 2
* Professor: Rejaul Chowdhury 
* */

import java.util.Scanner;

//The abstract class for Development
public abstract class Development implements Employee{
	protected int employeeID; //employee ID
	protected String firstName; //first name
	protected String lastName; //last name
	protected String email; //email address
	protected double yearlySalary; //salary 
	protected int supervisorID; // SUpervisor ID
	
	//Constructor without parameters
	Development(){};
	//Constructor with parameters
	Development(String firstName, String lastName, int employeeID, String email, double yearlySalary, int supervisorID){
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.email = email;
		this.yearlySalary = yearlySalary;
		this.supervisorID = supervisorID;
	};

	@Override
	public String toString(){
		String formatString = "Name: %s %s | Employee ID: %d | Email: %s | Supervisor ID: %d | Yearly Salary: %.0f | ";
		String result = String.format(formatString,firstName, lastName, employeeID, email, supervisorID, yearlySalary);
		return result;
	}
//The method to add developer's information
	public void addEmployee(Scanner input) {
		System.out.println("Enter first name of the employee: ");
		this.firstName = input.next();
		System.out.println("Enter last name of the employee: ");
		this.lastName = input.next();
		System.out.println("Enter ID of the employee: ");
		this.employeeID = input.nextInt();
		System.out.println("Enter the Email of the employee: ");
		this.email = input.next();
		System.out.println("Enter salary of the employee: ");
		this.yearlySalary = input.nextDouble();
		
		// 
		System.out.println("Enter the Supervisor's ID of the employee ");
		this.supervisorID = input.nextInt();
		
	}
}