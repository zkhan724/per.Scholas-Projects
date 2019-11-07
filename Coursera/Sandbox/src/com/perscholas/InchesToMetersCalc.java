package com.perscholas; 

// This program converts height from inches to meters.

import java.util.Scanner;

public class InchesToMetersCalc {

	public static void main(String[] args) {
		
		// create an object to receive input from the user.
		Scanner input = new Scanner(System.in);
		
		// User enters height in inches here.
		System.out.println("What is your height in inches? ");

		// define height from user and calculate to meters
		double num1 = input.nextDouble();
		double num2 = 0.0254;
		double num3 = num1 * 0.0254;
			
		// print out height in meters
		System.out.println("Your height is " + num3 + " meters!");

	}

}
