package com.perscholas;

import java.util.Scanner;

public class askingQuestions 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // create object of scanner class for input by user.
		System.out.println("Hello. What's your name?"); // User enters the name here.
		
		String name = input.nextLine(); // define String variable from user input
		System.out.println("Hello " + name + " How old are you?"); // ask for user age
		
		int age = input.nextInt(); // define integer variable from user input
		System.out.println("So you're " + age + " eh? That's not old at all! How much do you make, " + name + " ?");// state what user has input
		
		System.out.println("What is your annual income?"); //user enters wage here
		double wage = input.nextDouble(); // define integer variable from user input
		
		System.out.println("$" + wage + "!" + " That's really good for your " + age); // state what user input
	}
}


