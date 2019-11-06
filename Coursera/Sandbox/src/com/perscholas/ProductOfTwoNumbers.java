package com.perscholas;

import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User enters value here.
		System.out.println("Input first number: ");// you get first number right here (input)

		// define variables and characters
		double num1 = input.nextDouble();
		System.out.println("Input second number: ");
		
		double num2 = input.nextDouble();
		double num3 = num1 * num2;
		
			
		//output what you want to see
		System.out.println("Expected Output: " + num3);

	}

}
