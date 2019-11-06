package com.perscholas; // package of the project

import java.util.Scanner; //scanner utility created

public class AgeInFiveYears // class of the package com.perscholas
{

	public static void main(String[] args) // main method
{
	Scanner input = new Scanner(System.in); // create object of scanner class for input by user
	
	System.out.println("Hi there. What's your name?"); // ask for user name
	String name = input.nextLine(); // define string variable for users name
	
	System.out.println("Hi " + name + "! My name is Zaki. Nice to meet you. How old are you?"); // ask user for age
				
	int age = input.nextInt(); // define integer variable for users age
	int age2 = age + 5; // calculate user age + 5
	int age3 = age - 5; // calculate user age - 5
		
	//output user age after variables are calculated	
	System.out.println("Did you know that in 5 years you will be " + age2 + " years old? And 5 years ago you were " + age3 + "! Imagine that!");
}
}
