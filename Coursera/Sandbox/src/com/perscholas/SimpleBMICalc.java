package com.perscholas;

import java.util.Scanner;

public class SimpleBMICalc 
{
	public static void main(String[] args)	
  {
	// create scanner object to allow user input
	Scanner input = new Scanner(System.in);
		
	// ask user for height in meters
	System.out.println("Your Height in Meters:");
	
	// define integer variable from user height input
	double meters = input.nextDouble(); 
	
	// ask user for weight in Kg
	System.out.println("Your Weight in Kilograms (kg)"); 
	
	// define integer variable from user weight input and alculate bmi (weight / (height ^2
	double kg = input.nextDouble(); 
	double bmi  = kg / (meters * meters); 
	
	// output user BMI
	System.out.println("Your BMI is " + bmi);
  }

}
