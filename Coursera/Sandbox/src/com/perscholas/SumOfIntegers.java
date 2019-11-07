package com.perscholas;

// This program gives the Sum of Two Integers from user input.

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		
		// creates scanner object to allow user input
		Scanner input = new Scanner(System.in); 
		
		// ask user for the first number
		System.out.println("Give me your first number:");
		
		// define integer from user input
		int num1 = input.nextInt();
		
		// ask user for the second number
		System.out.println("Give me your second number:");
		
		// define integer variable from user input, and calculate the sum
		double num2 = input.nextDouble(); 
		double sum = num1 * num2; 
		
		// print the sum
		System.out.println("The Product is " + sum + ".");		

	}

}
