package com.perscholas;

import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
		// create object of scanner class for input by user.
				Scanner input = new Scanner(System.in);
				
				// User enters the name here.
				System.out.println("Hi there. What's your name?");

				// define variables and characters
				
				String name = input.nextLine(); //looks at the next String or variable
				System.out.println("Hi " + name + "! My name is Zaki. Nice to meet you. How old are you?");
				
				//user enters age here. age is calculated +5 and -5
				int age = input.nextInt();
				int age2 = age + 5;
				int age3 = age - 5;		
				
				//output what you want to see
				System.out.println("Did you know that in 5 years you will be " + age2 + " years old? And 5 years ago you were " + age3 + "! Imagine that!");
				
	}

}
