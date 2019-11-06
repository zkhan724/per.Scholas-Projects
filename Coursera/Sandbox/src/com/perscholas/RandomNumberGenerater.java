package com.perscholas;

import java.util.Scanner;

public class RandomNumberGenerater 
{
	public static void main(String[] args)
  {
	Scanner input = new Scanner(System.in);
		
	/* generate a random integer from 0-10. Add +1 to include 10 because Math.random generates number from 0-1 only. 
	* putting an int before math.random makes it into an integer instead of a double*/
		
	int num1 = (int) ((Math.random() * 50) +1); //
	int num2 = (int) ((Math.random() * 50) +1);
		
	System.out.println("What is " + num1 + " + " + num2 + "?"); // ASK USER TO ANSWER EQUATION
		
	int response = input.nextInt(); //STORE THE USERS RESPONSE TO CONFIRM IF IT IS CORRECT
		
	input.close(); //CLOSE SCANNER OBJECT AFTER YOU GET USER RESPONSE
		
	if(response == num1 + num2) //TEST THE USERS RESPONSE TO CONFIRM IF IT IS CORRECT (DONT NEED SEMICOLON)
		{
		System.out.println("You are correct!"); //PRINT OUT STATEMENT IF USERS ANSWER IS CORRECT
		}
	else 
		{
		System.out.println("Try again!"); //PRINT OUT A STATEMENT IS USERS ANSWER IS INCORRECT
		}
  }
}
