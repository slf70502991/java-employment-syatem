/**
* A brief description of the role of this class
* Student Name: YENLING, LIN
* Student Number: 041107273
* Course: CST8132 Object Oriented Programming
* Program: CET-CS-Level 2
* Professor: Rejaul Chowdhury 
* */

import java.util.Scanner;

public class Manager extends Management{
	private String rankOfM;
	//Constructor without parameters
	Manager(){};
	//Constructor with parameters
	Manager( String firstName, String lastName, int employeeID,String email, double yearlySalary, String teamName, String rankOfM){
//		super(firstName, lastName,email, yearlySalary, teamName);
		super(firstName,lastName,employeeID,email,yearlySalary,teamName);
		this.setRankOfM(rankOfM);
	}
	@Override
	public String toString(){
		
		return super.toString()+ "Designation: Manager | " + "Rank: "+ getRankOfM();
	}
	
	@Override
	public void addEmployee(Scanner input) {
		super.addEmployee(input);
		System.out.println("Enter the rank of the Manager: ");
		this.setRankOfM(input.next());	
		System.out.println("");
	}
	
	public String getRankOfM() {
		return rankOfM;
	}

	public void setRankOfM(String rankOfM) {
		this.rankOfM = rankOfM;
	}

	

	


	
}