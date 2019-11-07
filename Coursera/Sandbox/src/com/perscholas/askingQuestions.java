package com.perscholas;

// This program ask questions based upon user's name, age, and income.

import java.util.Scanner;

public class askingQuestions 
{
	public static void main(String[] args) 
	{
		// create object of scanner class for input by user.
		Scanner input = new Scanner(System.in); 
		
		// user enters their name here.
		System.out.println("Hello. What's your name?"); 
		
		// define String variable from user input
		String name = input.nextLine();
		
		// ask for user age
		System.out.println("Hello " + name + " How old are you?");
		
		// define age variable from user input
		int age = input.nextInt();
		
		// print the user age and name
		System.out.println("So you're " + age + " eh? That's not old at all! How much do you make, " + name + " ?");
		
		// ask user for income
		System.out.println("What is your annual income?");
		
		// define income variable from user input
		double income = input.nextDouble();
		
		// print results
		System.out.println("$" + income + "!" + " That's really good for your " + age);
	}
}


