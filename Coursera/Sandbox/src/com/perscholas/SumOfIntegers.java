package com.perscholas;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give me your first number:");
		int num1 = input.nextInt();
		System.out.println("Give me your second number:");
		double num2 = input.nextDouble();
		double sum = num1 * num2;
		
		System.out.println("The Product is " + sum + ".");
		

	}

}
