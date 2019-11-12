package com.perscholas;

import java.util.Scanner;

public class TheGreatestNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// create scanner object for user input
		System.out.println("Enter 1st number:");
		int num1 = input.nextInt();
		
		System.out.println("Enter 2nd number:");
		int num2 = input.nextInt();
		
		System.out.println("Enter 3rd number:");
		int num3 = input.nextInt();

		
		// Close scanner object.
		input.close();

		// Print results of greatest number
		if (num1 > num2 && num1 > num3)
		{
		System.out.println("The Greatest Number is " + num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
		System.out.println("The Greatest Number is " + num2);
		}
		else if (num3 > num1 && num3 > num2)
		{
		System.out.println("The Greatest Number is " + num3);
		}

	}

}
