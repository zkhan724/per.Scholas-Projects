package com.perscholas;

// This program calculates user age by +-5 years.

import java.util.Scanner;

public class AgeInFiveYears
{

	public static void main(String[] args)
{
	// create object of scanner class for input by user
	Scanner input = new Scanner(System.in);
	
	// ask for user's name
	System.out.println("Hi there. What's your name?");
	
	// define string variable for users name
	String name = input.nextLine(); 
	
	// ask user for age
	System.out.println("Hi " + name + "! My name is Zaki. Nice to meet you. How old are you?");
				
	// define integer variable for users age, and calculate age in 5 and past 5 years
	int age = input.nextInt();
	int age2 = age + 5; 
	int age3 = age - 5; 
		
	// print results	
	System.out.println("Did you know that in 5 years you will be " + age2 + " years old? And 5 years ago you were " + age3 + "! Imagine that!");
}
}
