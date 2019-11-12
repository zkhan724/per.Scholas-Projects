package com.perscholas;

import java.util.Scanner;

// This program defines the shape of an object based upon the # of sides. 

public class Conditional3NameThatShape {

	public static void main(String[] args) {
		
		//create scanner object for user input 
		Scanner input = new Scanner(System.in);
		
		// user input for # of sides of a shape, then define variable
		System.out.println("Give me the # of sides of a shape from 3-10:");
		int num = input.nextInt();
		
		// switch function to find true statement
		switch(num)
		{
		case 1:
			System.out.println("1 side is not a shape, try again!");
			break;
		case 2:
			System.out.println("2 sides is not a shape, try again!");
			break;
		case 3:
			System.out.println("3 sides is a Triagle");
			break;
		case 4:
			System.out.println("4 sides is a Quadrilateral");
			break;
		case 5:
			System.out.println("5 sides is a Pentagon");
			break;
		case 6:
			System.out.println("6 sides is a Hexagon");
			break;
		case 7:
			System.out.println("7 sides is a Heptagon");
			break;
		case 8:
			System.out.println("8 sides is a Octagon");
			break;
		case 9:
			System.out.println("9 sides is a Nonagon");
			break;
		case 10:
			System.out.println("10 sides is a Decagon");
			break;
		}

	}

}
