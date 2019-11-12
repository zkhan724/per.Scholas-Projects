package com.perscholas;

import java.util.Scanner;

public class Conditional3MonthNameToDays {

	public static void main(String[] args) 
	{
		// create scanner object for user input
		Scanner input = new Scanner(System.in);

		// user input for month
		System.out.println("Enter the name of a month to get the number of days in that month:");
		String month = input.nextLine();
		
		// if else function to find true statement and print result
		if (month.equals ("January") || month.equals ("january") ) 
		{
			System.out.println("January has 31 Days.");
		}
		else if (month.equals ("February") || month.equals ("february") ) 
		{
			System.out.println("February has 28 or 29 Days.");
		}
		else if (month.equals ("March") || month.equals ("march") )  
		{
			System.out.println("March has 31 Days.");
		}
		else if (month.equals ("April") || month.equals ("april") ) 
		{
			System.out.println("April has 30 Days.");
		}
		else if (month.equals ("May") || month.equals ("may") ) 
		{
			System.out.println("May has 31 Days.");
		}
		else if (month.equals ("June") || month.equals ("june") )  
		{
			System.out.println("June has 30 Days.");
		}
		else if (month.equals ("July") || month.equals ("july") ) 
		{
			System.out.println("July has 31 Days.");
		}
		else if (month.equals ("August") || month.equals ("august") ) 
		{
			System.out.println("August has 31 Days.");
		}
		else if (month.equals ("September") || month.equals ("september") ) 
		{
			System.out.println("September has 30 Days.");
		}
		else if (month.equals ("October") || month.equals ("october") ) 
		{
			System.out.println("October has 31 Days.");
		}
		else if (month.equals ("November") || month.equals ("november") ) 
		{
			System.out.println("November has 30 Days.");
		}
		else if (month.equals ("December") || month.equals ("december") )  
		{
			System.out.println("December has 31 Days.");
		}
		else
		{
			System.out.println("Error, please enter an actual month or check your spelling.");
		}
	}

}

