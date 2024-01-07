/**
* A brief description of the role of this class
* Student Name: YENLING, LIN
* Student Number: 041107273
* Course: CST8132 Object Oriented Programming
* Program: CET-CS-Level 2
* Professor: Rejaul Chowdhury 
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeList{
	Management m1 = new Manager("Rejaul", "Chowdhury",555, "rc@gmail.com", 120000, "AMDC","MG-05");
	Development d1 = new ITDeveloper("James","Rules",101,"jr@gmail.com",90000, 555,"Java");
	Development a1 = new ITAnalyst("Lisa","Dorman",102,"ld@gmail.com",85000, 555,"Desktop");
	
	Management m2 = new Manager("Cindy", "Bruns",999,"cb@yahoo.com", 125000, "T1SR","MG-06");
	Development a2 = new ITAnalyst("George","Sarazin",201,"gs@yahoo.com",85000, 999,"Mainframe");
	Development d2 = new ITDeveloper("Chan","Bui",202,"cb1@yahoo.com",80000, 999,"Cobol");

	EmployeeList(){
		ManagerList.add(m1);
		DeveloperList.add(d1);
		DeveloperList.add(a1);
		ManagerList.add(m2);
		DeveloperList.add(a2);
		DeveloperList.add(d2);
		
	};
	
	//Create 2 ArrayList: one for Management, and the other for Development
	ArrayList<Management> ManagerList = new ArrayList<Management>() ;
	ArrayList<Development> DeveloperList = new ArrayList<Development>();
	
	//User can choose in which category to add new employee
	public void addEmployee(Scanner input) {
		System.out.println("Please select the type of the employee you wish to add.");
		System.out.println("Type (without quotations) 'm' for Manager or 'd' for IT Developer or 'a' for IT Analyst :");
		
		String type = input.next();
		//If input type is "m", then add new manager
		if(type.equalsIgnoreCase("m")){
			Manager m = new Manager();
			ManagerList.add(m);
			m.addEmployee(input);
		//If input type is "d", then add new IT Developer
		}else if(type.equalsIgnoreCase("d")){
			ITDeveloper d = new ITDeveloper();
			DeveloperList.add(d);
			d.addEmployee(input);
		//If input type is "a", then add new IA Developer
		}else if(type.equalsIgnoreCase("a")) {
			ITAnalyst a = new ITAnalyst();
			DeveloperList.add(a);
			a.addEmployee(input);
		}
		else {
			System.out.println("Please enter again.");
		}
	}
			
	//
	public void printEmployeeDetails() {
		System.out.println("Employee Management System");
		System.out.println("***************************");
		System.out.println("Number of Employee: " + (ManagerList.size() + DeveloperList.size()));
		System.out.println("");
		System.out.println("List of Management Employees");
		System.out.println("");
		//Iterate through ManagerList and print each element.
		for(Management manager:ManagerList) {
			System.out.println(manager.toString());
		}
		System.out.println("");
		System.out.println("List of Development Employees");
		System.out.println("");
		//Iterate through ManagerList and print each element.
		for(Development developer:DeveloperList) {
			System.out.println(developer.toString());
		}
		System.out.println("");
	}

	public void updateEmail(Scanner input) {
		System.out.println("Enter the ID of the employee whose email needs to be updated");	
		int updateID = input.nextInt();
		//Check whether the specific employee is found. The default value is true.
		boolean isNotFound = true;
		
		//When isNotFound is set to false then the do-while loop will end.
		do {
		//Iterate the ManagerList to find the employee with sPecific ID. If not found, the loop will end move to next for loop.
			for(Management manager:ManagerList) {
				if(manager.employeeID == updateID) {
					System.out.println("Enter the new Email address of the employee");
					manager.email = input.next();
					System.out.printf("The new email address of James Rules is %s\n\n", manager.email);
					isNotFound = false;
					
				}
				break;
			}
			//Iterate the DeveloperList to find the employee with sPecific ID.
			for(Development developer:DeveloperList) {
				if(developer.employeeID == updateID) {
					System.out.println("Enter the new Email address of the employee");
					developer.email = input.next();
					System.out.printf("The new email address of James Rules is %s \n\n", developer.email);
					isNotFound = false;
					break;
				}
			}
			
			if(isNotFound) {
				System.out.println("No such employee.\n");
				break;
			}
		}while(isNotFound);
		
	}
			
	public void monthlyPayroll() {
		System.out.println("");
		System.out.println("The monthly payroll for Managers: ");
		for(Management m:ManagerList) {
			double monthlyPayroll = (m.yearlySalary)*0.8/12;
			System.out.printf("Deposit %.2f$ into %s %s's bank account.\n",monthlyPayroll, m.firstName, m.lastName);
		}
		System.out.println("The monthly payroll for Developers: ");
		for(Development d:DeveloperList) {
			double monthlyPayroll = (d.yearlySalary)*0.8/12;
			System.out.printf("Deposit %.2f$ into %s %s's bank account.\n",monthlyPayroll, d.firstName, d.lastName);
		}
		System.out.println();
	}
			
	public void displayTeamEmployee(Scanner input) {
		System.out.println("Please enter the supervisor ID");
		// Enter the supervisor ID
		int superID = input.nextInt();
		// Iterate the managerList and DeveloperList
		for(Management m:ManagerList) {
			if(m.employeeID == superID) {
				System.out.println(m);
				for(Development d:DeveloperList) {
					if(d.supervisorID == superID) {
						System.out.println(d);
					}
				}
			}
			
		}
		System.out.println();		
	}
	
	public void searchEmployee(Scanner input) {
		System.out.println("Please enter search criteria.\nType (without quotations) 'f' for searching by first name or 'l' for searching by last name: ");
		String option = input.next();
		
		switch(option) {
		//Enter "f" to search by first name
		case"f":
			System.out.println("Please entr the first name of the employee you are searching for.");
			String searchFirstName = input.next();
			//Use for loop to iterate ManagerList and find matched first name
			for(Management manager:ManagerList) {
				if(manager.firstName.equalsIgnoreCase(searchFirstName)) {
					System.out.println(manager.toString());
				}
			}
			//Use for loop to iterate DeveloperList and find matched first name
			for(Development developer:DeveloperList) {
				if(developer.firstName.equalsIgnoreCase(searchFirstName)) {
					System.out.println(developer.toString());
				}
			}
			System.out.println();
			break;
		//Enter "l" to search by last name	
		case"l":
			System.out.println("Please entr the last name of the employee you are searching for.");
			String searchLastName = input.next();
			//Use for loop to iterate ManagerList and find matched last name
			for(Management manager:ManagerList) {
				if(manager.lastName.equalsIgnoreCase(searchLastName)) {
					System.out.println(manager.toString());
				}
			}
			//Use for loop to iterate DeveloperList and find matched last name
			for(Development developer:DeveloperList) {
				if(developer.lastName.equalsIgnoreCase(searchLastName)) {
					System.out.println(developer.toString());
				}
			}
			System.out.println();
			break;
		}
		
	}

	public void removeEmployee(Scanner input) {
		System.out.println("Only Managers are allowed to remove and employee. Please provides your ID");
		
		//Create two ArrayLists to store the objects to remove
		ArrayList<Development> removeDeveloperList = new ArrayList<>();
		ArrayList<Management> removeManagerList = new ArrayList<>();
		//Create 2 iterators
		Iterator<Management> ManagerIterator = ManagerList.iterator();
		Iterator<Development> DeveloperIterator = DeveloperList.iterator();
		
		//This boolean is to check whether having a matched manager ID
		boolean hasManager = false;
		
		//Iterate the ManagerList to find whether having specific ID.
		int authorizedId = input.nextInt();
		for(Management m:ManagerList) {
			if(m.employeeID != authorizedId) {
				continue; //If not matched, then continue to the next iteration.
			}else { hasManager = true; } //If matched, set "hasManager" to true and end the loop
			break; }
		//Check whether the ID is authorized to remove an employee, if not, throw an exception
		try {
			if(!hasManager) throw new UnAuthorizedOperationException();
		}catch(UnAuthorizedOperationException e) {
			System.err.println("You are NOT authorized to run this operation.");
			System.out.println(e);
			System.out.println("Returning to the main menu\n");
		}
		//If found a matched manger ID, then run the operation of removing the employees
		if(hasManager) {
			System.out.println("How many employees do you want to remove?");
			int number = input.nextInt();
			//Check whether the number exceeds the number of total employees
			try {if(number > ManagerList.size()+ DeveloperList.size()) {
				throw new Exception();
			}else {
				for(int i =0; i<=number-1; i++) {
					System.out.println("Enter the ID of employee you want to remove");
					int removeID = input.nextInt();
					//Iterate the developer list
					for(Development developer:DeveloperList) {
						if(developer.employeeID == removeID) {
							removeDeveloperList.add(developer);//Add the developer into removeDeveloperList
						}else {
							continue;}
					}
					//Iterate the manager list
					for(Management manager:ManagerList) {
						if(manager.employeeID == removeID) {
							removeManagerList.add(manager);//Add the manager into removeDeveloperList
						}else {continue;}
					}
				}
			}}catch(Exception e) {
				System.out.println("The number exceeds the sum of total employees.\n");
			}
		}			
		
		//Remove the employee from developer list
		while ( DeveloperIterator.hasNext() ){
	    	if (removeDeveloperList.contains(DeveloperIterator.next())){
	    		DeveloperIterator.remove();	    		
	    	}	     
	    }
		//Remove the employee from manager list
		while(ManagerIterator.hasNext()) {
			if (removeManagerList.contains(ManagerIterator.next())){
	    		ManagerIterator.remove();	    		
	    	}
		}		
	}
	
	public void promoteEmployee(Scanner input)  {
		System.out.println("Only Managers are allowed to promote and employee. Please provides your ID");
		
		//Iterate the DeveloperList to find the specific employee
		ArrayList<Development> removeList = new ArrayList<>();
		
		//This boolean is to check whether having a matched manager ID
		boolean hasManager = false;
		
		//Iterate the ManagerList to find whether having specific ID.
		int authorizedId = input.nextInt();
		for(Management m:ManagerList) {
			if(m.employeeID != authorizedId) {
				continue; //If not matched, then continue to the next iteration.
			}else { hasManager = true; } //If matched, set "hasManager" to true and end the loop
		break; }
		
		try {
			//Throw the exception when entering the Id without authority
			if(!hasManager) throw new UnAuthorizedOperationException();
		}catch(UnAuthorizedOperationException e) {
			System.err.println("You are NOT authorized to run this operation.");
			System.out.println(e);
			System.out.println("Returning to the main menu\n");
		}
		//If found a matched manger ID, then run the operation of promotion
		if(hasManager) {
			System.out.println("Enter the ID of the employee you want to promote");
			int promoteID = input.nextInt();
			//Iterate the developerList to find the specific employee to promote
			for(Development d:DeveloperList) {
				if(d.employeeID != promoteID) {	
					continue; //If not matched, then continue to the next iteration.
				}else {//If finding the specific employee, then adding to the ManagerList
		 	     	//Create a new Manager instance
					Management newManager = new Manager(d.firstName, d.lastName,d.employeeID, d.email, d.yearlySalary, "Management-training","Assistant Manager");
					//Add the new manager to ManagerList
					ManagerList.add(newManager);
					//Add this developer into removeList
					removeList.add(d);
				}
			}
		}
		
		//Remove the specific employee from DeveloperList
		//Declare an iterator
		Iterator<Development> DeveloperIteri = DeveloperList.iterator();
		//Delete the employee in DeveloperList
		while(DeveloperIteri.hasNext()) {
			if(removeList.contains(DeveloperIteri.next())) {DeveloperIteri.remove();}
		}
	}
}
