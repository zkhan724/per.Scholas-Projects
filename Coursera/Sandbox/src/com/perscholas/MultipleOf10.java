package com.perscholas;

// This program gives muliplies a number from the range of 1-10.

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
		
		// create an object to receive input from the user.
		Scanner input = new Scanner(System.in);
		
		//ask user to enter a value from 1-10
		System.out.println("Enter a value from 1-10:"); 
		
		// define value from user input
		int num1 = input.nextInt();
		
		// increment the integer
		for (int i = 0; i< 10; i++)
		
		// print results
		System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));

	}

}
