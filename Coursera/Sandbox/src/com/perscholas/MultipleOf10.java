package com.perscholas;

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //function for user input
		
		System.out.println("Enter a value: "); // user input
		int num1 = input.nextInt();
		
		for (int i = 0; i< 10; i++) // build the loop when you increment the integer
			
		System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));

	}

}
