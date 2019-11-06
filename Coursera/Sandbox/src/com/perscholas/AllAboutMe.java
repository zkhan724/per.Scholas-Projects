package com.perscholas; // package of Project Sandbox

import java.util.Scanner; // Scanner object created

public class AllAboutMe // class of package com.perscholas
{

	public static void main(String[] args) // main method
{
	Scanner input = new Scanner(System.in); // scanner object created for user input
	System.out.println("What is your name?"); // ask user for name
	String name = input.nextLine(); // capture and define string variable for name

	System.out.println("How old are you?"); // ask user for age
	String age = input.nextLine(); // capture and define string variable for age
	
	System.out.println("How tall are you?"); // ask user for height
	String height = input.nextLine(); // capture and define string variable for height
	int num1 = Integer.parseInt(height); //converting a string variable to an integer variable for height
	int num2 = (int) (num1 * 30.48);// height conversion to centimeters 
		
	System.out.println("What color are your eyes?"); // ask user for eye color
	String eyes = input.nextLine(); // capture and define string variable for eye color
	
	System.out.println("What color are your teeth?"); // ask user for teeth color
	String teeth = input.nextLine(); // capture and define string variable for teeth color
	
	System.out.println("What color is your hair?");	// ask user for hair color
	String hair = input.nextLine(); // capture and define string variable for hair color
		
	// output story based upon user	
	System.out.println("\nLet's talk about " + name + 
	"\nThey're " + num2 + " centimeters tall." + 
	"\nThey're " + age + " years old." + 
	"\nHuh, that's older than I expected..." +
	"\nThey have " + eyes + " eyes" + " and " + hair + " hair." +
	"\nTheir teeth are usually " + teeth + ", but it depends on the coffee." +
	"\nAlright, this is pretty boring. Let's stop talking about " + name + ".");
}

}


