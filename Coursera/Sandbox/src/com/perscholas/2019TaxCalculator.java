package com.perscholas;

import java.util.Scanner;

// This application computes 2019 Income Taxes based on filing status.

public class ComputingTaxes {

	public static void main(String[] args) {
		
		// Creates scanner object to allow user input
		Scanner input = new Scanner(System.in); 
		
		// Ask user for filing information
		System.out.println("Welcome to my Tax Computing Program for 2019\n" +
						   "\nPlease enter your filing status:\n" +
						   "\n1.) Single" +
						   "\n2.) Married Filing Jointly or Qualifying Widow(er)" +
						   "\n3.) Married Filing Separatley " +
						   "\n4.) Head of Household");
		
		// Receive integer input regarding filing status
		int response = input.nextInt();
		
		// Ask user for 2019 Annual Income
		System.out.println("What is your 2019 Annual Income:");
		
		// Receive integer input regarding Annual Income
		double income = input.nextDouble();
	
		// Close scanner object
		input.close();
		
		//define tax rate, and tax owed variables
		double taxRate;
		double taxOwed;
		
		// Calculate 10% Tax Rate for all filing status
		if (response == 1 && income <= 9700) 
		{
			taxRate = .10;
			taxOwed = taxRate * income;
			System.out.println("You are a Single filer. Your Marginal Tax Rate is " + taxRate + "." +
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020." );
		} 
		else if (response == 2 && income <= 19400) 
		{
			taxRate = .10;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Jointly. Your Marginal Tax Rate is " + taxRate + "." +
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020." );
		}
		else if (response == 3 && income <= 9700) 
		{
			taxRate = .10;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Separately. Your Marginal Tax Rate is " + taxRate + "." +
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020." );
		}
		else if (response == 4 && income <= 13850) 
		{
			taxRate = .10;
			taxOwed = taxRate * income;
			System.out.println("You are filing as Head of Household. Your Marginal Tax Rate is " + taxRate + "." +
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020." );
		}
		
		// Calculate 12% Tax Rate for all filing status
		else if (response == 1 && income >= 9701 && income <= 39475) 
		{
			taxRate = .12;
			taxOwed = taxRate * income;
			System.out.println("You are a Single filer. Your Marginal Tax Rate is " + taxRate + "." +
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020." );
		}
		else if (response == 2 && income >= 19401 && income <= 78950) 
		{
			taxRate = .12;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Jointly. Your Marginal Tax Rate is " + taxRate + "." +
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020." );
		}
		else if (response == 3 && income >= 9701 && income <= 39475) 
		{
			taxRate = .12;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Separately. Your Marginal Tax Rate is " + taxRate + "." +
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020." );
		}
		else if (response == 4 && income >= 13851 && income <= 52850) 
		{
			taxRate = .12;
			taxOwed = taxRate * income;
			System.out.println("You are filing as Head of Household. Your Marginal Tax Rate is " + taxRate + "." +
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020." );
		}
		
		// Calculate 22% Tax Rate for all filing status
		else if (response == 1 && income >= 39476 && income <= 84200) 
		{
			taxRate = .22;
			taxOwed = taxRate * income;
			System.out.println("You are a Single filer. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 2 && income >= 78951 && income <= 168400) 
		{
			taxRate = .22;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Jointly. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 3 && income >= 39476 && income <= 84200) 
		{
			taxRate = .22;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Separately. Your Marginal Tax Rate is " + taxRate + "." + 
						       "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 4 && income >= 52851 && income <= 84200) 
		{
			taxRate = .22;
			taxOwed = taxRate * income;
			System.out.println("You are filing as Head of Household. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		}
		
		// Calculate 24% Tax Rate for all filing status
		else if (response == 1 && income >= 84201 && income <= 160725) 
		{
			taxRate = .24;
			taxOwed = taxRate * income;
			System.out.println("You are a Single filer. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 2 && income >= 168401 && income <= 321450) 
		{
			taxRate = .24;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Jointly. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
			
		} 
		else if (response == 3 && income >= 84201 && income <= 160725) 
		{
			taxRate = .24;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Separately. Your Marginal Tax Rate is " + taxRate + "." + 
						       "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 4 && income >= 84201 && income <= 160000) 
		{
			taxRate = .24;
			taxOwed = taxRate * income;
			System.out.println("You are filing as Head of Household. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		}
		
		// Calculate 32% Tax Rate for all filing status
		else if (response == 1 && income >= 160726 && income <= 204100) 
		{
			taxRate = .32;
			taxOwed = taxRate * income;
			System.out.println("You are a Single filer. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
			
		} 
		else if (response == 2 && income >= 321451 && income <= 408200) 
		{
			taxRate = .32;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Jointly. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 3 && income >= 160726 && income <= 204100) 
		{
			taxRate = .32;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Separately. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 4 && income >= 160701 && income <= 204100) 
		{
			taxRate = .32;
			taxOwed = taxRate * income;
			System.out.println("You are filing as Head of Household. Your Marginal Tax Rate is " + taxRate + "." + 
						       "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		}
		
		// Calculate 35% Tax Rate for all filing status
		else if (response == 1 && income >= 204101 && income <= 510300) 
		{
			taxRate = .35;
			taxOwed = taxRate * income;
			System.out.println("You are a Single filer. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 2 && income >= 408201 && income <= 612350) 
		{
			taxRate = .35;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Jointly. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made " + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 3 && income >= 204101 && income <= 306175) 
		{
			taxRate = .35;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Separately. Your Marginal Tax Rate is " + taxRate + "." + 
					   "\nYou made " + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 4 && income >= 204101 && income <= 510300) 
		{
			taxRate = .35;
			taxOwed = taxRate * income;
			System.out.println("You are filing as Head of Household. Your Marginal Tax Rate is " + taxRate + "." + 
					   		   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		}
		
		// Calculate 37% Tax Rate for all filing status
		else if (response == 1 && income >= 510301) 
		{
			taxRate = .37;
			taxOwed = taxRate * income;
			System.out.println("You are a Single filer. Your Marginal Tax Rate is " + taxRate + "." + 
						       "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 2 && income >= 612351) 
		{
			taxRate = .37;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Jointly. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made " + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 3 && income >= 306176) 
		{
			taxRate = .37;
			taxOwed = taxRate * income;
			System.out.println("You are Married, Filling Separately . Your Marginal Tax Rate is " + taxRate + "." + 
						       "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		} 
		else if (response == 4 && income >= 510301)
		{
			taxRate = .37;
			taxOwed = taxRate * income;
			System.out.println("You are filing as Head of Household. Your Marginal Tax Rate is " + taxRate + "." + 
							   "\nYou made $" + income + " in 2019. You owe the IRS $" + taxOwed + " by April 2020.");
		}
	}
}
