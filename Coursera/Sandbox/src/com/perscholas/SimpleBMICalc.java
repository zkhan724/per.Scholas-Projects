package com.perscholas;

import java.util.Scanner;

public class SimpleBMICalc 
{
	public static void main(String[] args)	// main method
  {
	Scanner input = new Scanner(System.in); // create scanner object to allow user input
	System.out.println("Your Height in Meters:"); // ask user for height in meter
		
	double meters = input.nextDouble(); // define integer variable from user height input
	System.out.println("Your Weight in Kilograms (kg)"); // ask user for weight in Kg
		
	double kg = input.nextDouble(); // define integer variable from user weight input
	double bmi  = kg / (meters * meters); //calculate bmi here (weight / (height ^2))
	
	System.out.println("Your BMI is " + bmi); // output user BMI
  }

}
