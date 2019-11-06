package com.perscholas; 

import java.util.Scanner;

public class InchesToMetersCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User enters value here.
		System.out.println("Input a value for inch: ");

		// define variables and characters
		double num1 = input.nextDouble();
		double num2 = 0.0254;
			
		//output what you want to see
		System.out.println(num1 * num2);

	}

}
