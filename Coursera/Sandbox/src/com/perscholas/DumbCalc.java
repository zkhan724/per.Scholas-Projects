package com.perscholas;

// This program takes 3 numbers and divides them by 2.

import java.util.Scanner;

public class DumbCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// ask user for first number
		System.out.println("What is your first number?");

		// define variables and characters
		double num1 = input.nextDouble();
		
		// ask user for second number
		System.out.println("What is your second number?");
		
		// define second user input variable
		double num2 = input.nextDouble();
		
		// ask user for third number
		System.out.println("What is your third number?");
		
		// // define third user imput variable, and calculate
		double num3 = input.nextDouble();
		double num4 = (num1 + num2 + num3) / 2.0;
			
		// Print results
		System.out.println("(" + num1 + " + " + num2 + " + " + num3 + " / 2 is ... " + num4 + "!" );
		

	}

}
