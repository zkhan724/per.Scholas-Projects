package com.perscholas;

// This program mines user data based on user input.

import java.util.Scanner;

public class DataMining {

	public static void main(String[] args) {
		
		System.out.println("Please enter the following information so I can sell it for a profit!");

		Scanner input = new Scanner(System.in);
		System.out.println("First Name:");
		
		String fname = input.nextLine();
		System.out.println("Last Name:");
		
		String lname = input.nextLine();
		System.out.println("Grade (9-12):"); 
		
		String grade = input.nextLine();
		System.out.println("Student ID:"); 
		
		String id = input.nextLine();
		System.out.println("Login:"); 
		
		String login = input.nextLine();
		System.out.println("GPA (0.0-4.0):"); 
		
		double gpa = input.nextDouble();
		System.out.println("\nLogin: " + login + "\nID: " + id + "\nName: " + lname + ", " + fname + "\nGPA: " + gpa + "\nGrade: " + grade); // user input

	}

}
