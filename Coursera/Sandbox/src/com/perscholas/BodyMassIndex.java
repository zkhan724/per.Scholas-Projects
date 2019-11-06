package com.perscholas;

import java.util.Scanner;

public class BodyMassIndex 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in); //creates object to allow user input
		
		System.out.println("Your Height in Meters:"); // User enters height in meters here.
		double meters = input.nextDouble(); //assign variable for user input
		
		System.out.println("Your Weight in Kilograms (Kg):"); // User enters weight in Kg here.
		double kg = input.nextDouble(); //assign variable for user input
		
		double bmi  = kg / (meters * meters); //calculate bmi here (weight / (height ^ 2))
		
		System.out.println("\nYour BMI is " + bmi + "\n");// tell the user what their BMI is
		
		if (bmi < 18.5) //compare user BMI if its under 18.5
		{
			System.out.println("According to you BMI, you are underweight. EAT SOME DAMN FOOD!"); //PRINT OUT STATEMENT IF BMI is under 18.5
		}
		else if (bmi >= 18.5 && bmi < 25.0)
		{
			System.out.println("According to you BMI, you are in normal health range. EASY MONEY!"); //PRINT OUT A STATEMENT IF BMI is >= 18.5 AND BMI is < 25
		}
		else if (bmi >= 25.0 && bmi < 30.0)
		{
			System.out.println("According to you BMI, you are overweight. STOP EATING LIKE SHIT"); //PRINT OUT A STATEMENT IF BMI is >= 25.0 AND BMI is < 30.0
		}
		else if (bmi >= 30.0)
		{
			System.out.println("According to your BMI, you are obese. GET YOUR FATASS INTO THE GYM!"); //PRINT OUT A STATEMENT IF BMI is >= 30.0
		}
		
	}

}
