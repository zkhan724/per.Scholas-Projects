package com.perscholas;
import java.util.Scanner;

public class SimpleBMICalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User enters height in meters here.
		System.out.println("Your Height in Meters:");

		// define variables and characters
		double meters = input.nextDouble();
		System.out.println("Your Weight in Kilograms (kg)");
		
		double kg = input.nextDouble();
		double bmi  = kg / (meters * meters); //calculate bmi here (weight / (height ^2))
			
		//output what you want to see
		System.out.println("Your BMI is " + bmi);

	}

}
