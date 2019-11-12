package com.perscholas;

import java.util.Scanner;

// This application calculates your space weight on different planets in our solar system.

public class SpaceWeightConditionalExercise {

	public static void main(String[] args) {
		// create an object to receive input from the user.
		Scanner input = new Scanner(System.in);
				
		// Ask user for weight.
		System.out.println("Please enter your current Earth weight in lbs:");
		
		// Define integer variable from user input.
		double weight = input.nextDouble();
		
		// Calculate user weight on other planets.
		double venus = weight * .78;
		double mars = weight * .39;
		double jupiter = weight * 2.65;
		double saturn = weight * 1.17;
		double uranus = weight * 1.05;
		double neptune = weight * 1.23;
		
		// Ask user which planet they want to calculate their space weight.
		System.out.println("I have information for the following planets:\n" + 
						   "1. Venus\n" + 
						   "2. Mars\n" + 
						   "3. Jupiter\n" + 
						   "4. Saturn\n" + 
						   "5. Uranus\n" + 
						   "6. Neptune\n" + 
						   "Which planet are you visiting?");
		
		// Define user input integer variable 
		int planet = input.nextInt();
		
		// Close scanner object
		input.close();
		
		// Based upon user input for which planet they choose, print out space weight.
		switch(planet)
		{
		case 1:
			System.out.println("Your weight would be " + venus + " lbs on Venus!");
			break;
		case 2:
			System.out.println("Your weight would be " + mars + " lbs on Mars!");
			break;
		case 3: 
			System.out.println("Your weight would be " + jupiter + " lbs on Jupiter!");
			break;
		case 4:
			System.out.println("Your weight would be " + saturn + " lbs on Saturn!");
			break;
		case 5: 
			System.out.println("Your weight would be " + uranus + " lbs on Uranus!");
			break;
		case 6:
			System.out.println("Your weight would be " + neptune + " lbs on Neptune!");
			break;
		default:
			System.out.println("Error, choose from the numbered planets above!");
		}

	}

}











