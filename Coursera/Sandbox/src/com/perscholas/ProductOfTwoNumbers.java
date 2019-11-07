package com.perscholas;

// This program gives the Product of Two Numbers.

import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		
		// Scanner object created for user input
		Scanner input = new Scanner(System.in);
		
		// User inputs first number.
		System.out.println("Input first number: ");

		// Define first number.
		double num1 = input.nextDouble();
		
		// User inputs second number.
		System.out.println("Input second number: ");
		
		// Define second number and calculate both numbers from user
		double num2 = input.nextDouble();
		double num3 = num1 * num2;
		
		//Print results.
		System.out.println("Expected Output: " + num3);

	}

}
