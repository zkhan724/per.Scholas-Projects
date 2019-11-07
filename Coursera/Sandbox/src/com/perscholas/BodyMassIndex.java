package com.perscholas;

import java.util.Scanner;

// This program calculates user's BMI and weight condition.

public class BodyMassIndex {

	public static void main(String[] args) // main method
	{
		 // creates scanner object to allow user input
		Scanner input = new Scanner(System.in);

		// Ask user to enter height in meters here,  
		System.out.println("Your Height in Meters:"); 
		
		// define integer variable from user height input
		double meters = input.nextDouble();
		
		// ask user to enter weight in KG
		System.out.println("Your Weight in Kilograms (Kg):"); 
		
		// define integer variable from user weight input
		double kg = input.nextDouble(); 
		
		// calculate bmi here (weight / (height ^ 2))
		double bmi = kg / (meters * meters);

		// print out user's BMI
		System.out.println("\nYour BMI is " + bmi + "\n");

		// Compare BMI to certain conditions to print out results
		if (bmi < 18.5)
		{
			System.out.println("According to you BMI, you are underweight."); 
		}
		else if (bmi >= 18 && bmi < 25) 
		{
			System.out.println("According to you BMI, you are in normal health range!"); 
		} 
		else if (bmi >= 25 && bmi < 30) 
		{
			System.out.println("According to you BMI, you are overweight.");
		} 
		else if (bmi >= 30) 
		{
			System.out.println("According to your BMI, you are obese.");
		}
		else 
		{
			System.out.println("Error, please fill out correct information.");
		}

	}

}
