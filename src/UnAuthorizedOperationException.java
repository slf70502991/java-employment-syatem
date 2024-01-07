/**
* A brief description of the role of this class
* Student Name: YENLING, LIN
* Student Number: 041107273
* Course: CST8132 Object Oriented Programming
* Program: CET-CS-Level 2
* Professor: Rejaul Chowdhury 
* */
//Customized exception class
public class UnAuthorizedOperationException extends Exception{
	public UnAuthorizedOperationException(String message) {
		super(message);
	}
	public UnAuthorizedOperationException() {};	
	
}