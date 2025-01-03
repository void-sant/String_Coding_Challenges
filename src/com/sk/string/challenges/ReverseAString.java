package com.sk.string.challenges;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter String");

	    String input = myObj.nextLine();  // Read user input
	    System.out.println("Original String is : " + input);
	    String output = reverseString(input);
	    System.out.println("Reversed String is : " + output);

	}
	public static String reverseString(String input) {
	   /*StringBuilder reverse = new StringBuilder(input);
		return reverse.reverse().toString();
	   */
		
		String reversed = "";
		for(int i = input.length()-1; i>=0; i--) {
			reversed = reversed + input.charAt(i);
		}
		return reversed;
	}

}
