package com.perscholas;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me your first word:");
		
		String word1 = input.nextLine();
		System.out.println("Give me your second word:");
		
		String word2 = input.nextLine();
		String word3 = word1.concat(" " + word2);
		
		System.out.println("Put your words together and you get " + word3 + ".");
		

	}

}
