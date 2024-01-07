/**
* A brief description of the role of this class
* Student Name: YENLING, LIN
* Student Number: 041107273
* Course: CST8132 Object Oriented Programming
* Program: CET-CS-Level 2
* Professor: Rejaul Chowdhury 
* */

import java.util.Scanner;

public abstract class Management implements Employee{
	
	protected int employeeID;
	protected String firstName;
	protected String lastName;
	protected String email;
	protected double yearlySalary;
	protected String teamName;
	//Constructor without parameters
	Management(){};
	//Constructor with parameters
	Management( String firstName, String lastName, int employeeID,String email, double yearlySalary, String teamName){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.email = email;
		this.yearlySalary = yearlySalary;
		this.teamName = teamName;
	}
	
	//For searchEmployee method: user can get the first name to search the specific employee
	public String getFirstName() {
		return firstName;
	};
	//For searchEmployee method: user can get the last name to search the specific employee
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		String formatString = "Name: %s %s | Employee ID: %d | Email: %s| Yearly Salary: %.0f |";
		String result = String.format(formatString,firstName, lastName, employeeID, email, yearlySalary);
		return result;
		
	};
	//The method to add manager's information
	public void addEmployee(Scanner input) {
		System.out.println("Enter first name of the manager: ");
		this.firstName = input.next();
		System.out.println("Enter last name of the manager: ");
		this.lastName = input.next();
		System.out.println("Enter the ID of the manager: ");
		this.employeeID = input.nextInt();
		System.out.println("Enter the Email of the manager: ");
		this.email = input.next();
		System.out.println("Enter salary of the manager: ");
		this.yearlySalary = input.nextDouble();
		System.out.println("Enter the team name of the Manager: ");
		this.teamName = input.next();
	};
}