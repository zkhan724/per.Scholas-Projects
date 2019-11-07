package com.perscholas;

//This program calculates the area of a circle based upon user input of radius.

import java.util.Scanner;

public class AreaOfaCircle {

	public static void main(String[] args) 
	{
        	// create scanner object
		Scanner input = new Scanner(System.in);
		
		// ask user for the radius of a circle
        	System.out.print("Enter the Radius of a Circle: ");
        	
		// define the radius, and calculate the are using Math.PI
        	double radius = input.nextDouble();
        	double area = Math.PI * (radius * radius);      
        
		// Print results
        	System.out.println("Area = " + area);

	}

}
