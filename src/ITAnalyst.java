/**
* A brief description of the role of this class
* Student Name: YENLING, LIN
* Student Number: 041107273
* Course: CST8132 Object Oriented Programming
* Program: CET-CS-Level 2
* Professor: Rejaul Chowdhury 
* */

import java.util.Scanner;

public class ITAnalyst extends Development{
	private String analysisArea;
	//Constructor without parameters
	ITAnalyst(){};
	//Constructor with parameters
	ITAnalyst(String firstName, String lastName, int employeeID, String email, double yearlySalary, int supervisorID, String analysisArea){
		super(firstName,lastName, employeeID,email,yearlySalary,supervisorID);
		this.analysisArea = analysisArea;
	};
	
	@Override
	public String toString(){
		return super.toString() + "Designation: IT Analyer | Area of Analysis: " + analysisArea;
	}
	@Override
	public void addEmployee(Scanner input) {
		super.addEmployee(input); 
		System.out.println("Enter the area of analysis of the IT Analyst: ");
		this.analysisArea = input.next();
		System.out.println();
		
	}
	
}