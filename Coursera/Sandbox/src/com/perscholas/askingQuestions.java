package com.perscholas;

import java.util.Scanner;

public class askingQuestions {

	public static void main(String[] args) {
		// create object of scanner class for input by user.
		Scanner input = new Scanner(System.in);
		
		// User enters the name here.
		System.out.println("Hello. What's your name?");

		// define variables
		
		String name = input.nextLine(); //looks at the next integer
		System.out.println("Hello " + name + " How old are you?");
		
		//user enters age here
		int age = input.nextInt();
		System.out.println("So you're " + age + " eh? That's not old at all! How much do you make, " + name + " ?");// calculate the variable
		
		//user enters wage here
		double wage = input.nextDouble();
		
		System.out.println("$" + wage + "!" + " That's really good for your " + age);
		

	}

	}


