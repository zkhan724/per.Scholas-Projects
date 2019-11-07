package com.perscholas;

// This program concatenates two words together from user input.

import java.util.Scanner;

public class StringConcat 
{

	public static void main(String[] args)
	{	
		// creates scanner object to allow user input
		Scanner input = new Scanner(System.in);
		
		// ask user for first word
		System.out.println("Give me your first word:");
		
		// define string variable from user first word
		String word1 = input.nextLine();
		
		// ask user for second word
		System.out.println("Give me your second word:"); // ask user for second word
		
		// define string variable from user words, and concatenate both words together
		String word2 = input.nextLine();
		String word3 = word1.concat(" " + word2); 
		
		// print concatenated words
		System.out.println("Put your words together and you get " + word3 + ".");
	}

}
