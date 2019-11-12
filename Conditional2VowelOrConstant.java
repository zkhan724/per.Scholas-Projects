package com.perscholas;

import java.util.Scanner;

public class Conditional2VowelOrConstant {

	public static void main(String[] args) {
			// create an object to receive input from the user.
			Scanner input = new Scanner(System.in);
			
			// ask user for a letter 
			System.out.println("Input an alphabet");
			
			// define a string variable from user input
			String string = input.next();
			
			//cast the string to char in order to use char functions
			char[] c = string.toCharArray();  
			
			//if user enters more than one number print out an error
			if(c.length > 1) 
			{
				System.out.println("error too many letters");
			}
			
			//check to see what letter is a vowel or consonant
			if(c[0] == 'a'|| c[0] == 'e'|| c[0] =='i'
			   ||c[0] == 'o'|| c[0] == 'u'|| c[0] == 'A'
			   ||c[0] =='E'|| c[0] == 'I'|| c[0] == 'O'
			   ||c[0] == 'U')
			{
				System.out.println("Letter is a vowel"); 
			}
			else if((c[0] >= 'a' && c[0] <='z') || (c[0] >= 'A' && c[0] <= 'Z'))
			{
				System.out.println("Letter is a consonant");
			}
			  else
				System.out.println("Not an alphabet");		
	}

}
