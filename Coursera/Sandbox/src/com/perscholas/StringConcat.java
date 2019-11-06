package com.perscholas;

import java.util.Scanner;

public class StringConcat 
{

	public static void main(String[] args) // main method
	{
		Scanner input = new Scanner(System.in); // creates scanner object to allow user input
		System.out.println("Give me your first word:"); // ask user for first word
		
		String word1 = input.nextLine(); // define string variable from user input
		System.out.println("Give me your second word:"); // ask user for second word
		
		String word2 = input.nextLine(); // define string variable from user input
		String word3 = word1.concat(" " + word2); // concatenate both words together
		
		System.out.println("Put your words together and you get " + word3 + "."); //output concatenated words
	}

}
