package com.perscholas;

// This program generates a random number and aks the user to guess what that random number is.

import java.util.Scanner;

public class RandomNumberGenerater 
{
	public static void main(String[] args)
  {
	Scanner input = new Scanner(System.in);
		
	/* generate a random integer from 0-10. Add +1 to include 10 because Math.random generates number from 0-1 only. 
	putting an int before math.random makes it into an integer instead of a double
	*/
		
	int num1 = (int) ((Math.random() * 50) +1); //
	int num2 = (int) ((Math.random() * 50) +1);
	
	// ASK USER TO ANSWER EQUATION
	System.out.println("What is " + num1 + " + " + num2 + "?");
		
	//STORE THE USERS RESPONSE TO CONFIRM IF IT IS CORRECT
	int response = input.nextInt();
		
	//CLOSE SCANNER
	input.close();
	
	//TEST THE USERS RESPONSE TO CONFIRM IF STATEMENT IS TRUE
	if(response == num1 + num2)
	{
	System.out.println("You are correct!");
	}
	else 
	{
	System.out.println("Try again!"); 
	}
  }
}
