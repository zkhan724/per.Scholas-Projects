package com.perscholas;

import java.util.Scanner;

public class DataMining {

	public static void main(String[] args) {
		
		System.out.println("Please enter the following information so I can sell it for a profit!");

		// User enters the name here.
		Scanner input = new Scanner(System.in);
		System.out.println("First Name:");
		
		//define variables
		String fname = input.nextLine();
		System.out.println("Last Name:"); // user input
		
		String lname = input.nextLine();
		System.out.println("Grade (9-12):"); // user input
		
		String grade = input.nextLine();
		System.out.println("Student ID:"); // user input
		
		String id = input.nextLine();
		System.out.println("Login:"); // user input
		
		String login = input.nextLine();
		System.out.println("GPA (0.0-4.0):"); // user input
		
		double gpa = input.nextDouble();
		System.out.println("\nLogin: " + login + "\nID: " + id + "\nName: " + lname + ", " + fname + "\nGPA: " + gpa + "\nGrade: " + grade); // user input

	}

}
