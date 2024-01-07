/**
* A brief description of the role of this class
* Student Name: YENLING, LIN
* Student Number: 041107273
* Course: CST8132 Object Oriented Programming
* Program: CET-CS-Level 2
* Professor: Rejaul Chowdhury 
* */

import java.util.Scanner;

public class ITDeveloper extends Development{
	private String programmingPlat;
	//Constructor without parameters
	ITDeveloper(){};
	//Constructor with parameters
	ITDeveloper(String firstName, String lastName,int employeeID,  String email, double yearlySalary, int supervisorID, String programmingPlat){
		super(firstName,lastName, employeeID,email,yearlySalary,supervisorID);
		this.programmingPlat = programmingPlat;
	};
	@Override
	public String toString(){
		return super.toString() + "Designation: IT Developer | Programming Platform: "+ programmingPlat;
		
	}
	@Override
	public void addEmployee(Scanner input){
		super.addEmployee(input);
		System.out.println("Enter the programming platform of the IT Developer: ");
		this.programmingPlat = input.next();
		System.out.println();
	}
	
}