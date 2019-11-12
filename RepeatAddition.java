package com.perscholas;

import java.util.Scanner;

public class RepeatAddition {

	public static void main(String[] args) {
		// create an object to get an input from the user
		Scanner input = new Scanner(System.in);
				
		// generate random numbers
		int num1 = (int) ((Math.random() * 9) +1);
		int num2 = (int) ((Math.random() * 9) + 1);
				
		// ask user to answer the question
		System.out.println("What does "+ num1 + " + " + num2 + " equal?");
				
		// take the answer from user and define variables
		int num3 = input.nextInt();
				
		// run while look until user answers correctly
				
		if ((num1 + num2) == num3)
					
			System.out.println("You are correct!");
					
		while ((num3 < (num1 + num2)) || (num3 >(num1 + num2))) 
		{
			System.out.print("Try again, What is " + num1  + " + " + num2 + " :" );
			 num3 = input.nextInt();
		}
			System.out.println("You are correct!");
	}

}
