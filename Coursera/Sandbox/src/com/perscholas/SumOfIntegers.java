package com.perscholas;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creates scanner object to allow user input
		System.out.println("Give me your first number:"); // ask user for the first number
		
		int num1 = input.nextInt(); // define integer variable from user input
		System.out.println("Give me your second number:"); // ask user for the second number
		
		double num2 = input.nextDouble(); // define integer variable from user input
		double sum = num1 * num2; // calculate the sum of num1 & num2
		
		System.out.println("The Product is " + sum + "."); //output the sum		

	}

}
