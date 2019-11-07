package com.perscholas; 

import java.util.Scanner; 

public class AllAboutMe 
{

	public static void main(String[] args) 
{
	Scanner input = new Scanner(System.in); 
	
	// ask user for information, define all user variables
	System.out.println("What is your name?"); 
	String name = input.nextLine(); 

	System.out.println("How old are you?"); 
	String age = input.nextLine(); 
	
	System.out.println("How tall are you?"); 
	String height = input.nextLine(); 
	
	int num1 = Integer.parseInt(height); 
	int num2 = (int) (num1 * 30.48); 
		
	System.out.println("What color are your eyes?"); 
	String eyes = input.nextLine(); 
	
	System.out.println("What color are your teeth?");
	String teeth = input.nextLine(); 
	
	System.out.println("What color is your hair?");	
	String hair = input.nextLine(); 
		
	// Print results	
	System.out.println("\nLet's talk about " + name + 
	"\nThey're " + num2 + " centimeters tall." + 
	"\nThey're " + age + " years old." + 
	"\nHuh, that's older than I expected..." +
	"\nThey have " + eyes + " eyes" + " and " + hair + " hair." +
	"\nTheir teeth are usually " + teeth + ", but it depends on the coffee." +
	"\nAlright, this is pretty boring. Let's stop talking about " + name + ".");
}

}


