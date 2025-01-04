package com.sk.string.challenges;

import java.util.Scanner;

public class CompressStringWithNumber {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter String");

	    String input = myObj.nextLine();  // Read user input
	    System.out.println("Original String is : " + input);
	    String output = compressedString(input);
	    System.out.println("Compressed String with Character count is : " + output);

	}

	private static String compressedString(String input) {
		StringBuilder compressed = new StringBuilder();
		int count = 1;
		for(int i = 1; i<input.length(); i++) {
			if(input.charAt(i) == input.charAt(i-1)) {
				count++;
			}
			else {
				compressed.append(input.charAt(i-1)).append(count);
				count = 1;
			}
			System.out.println(compressed.toString());
		}
		compressed.append(input.charAt(input.length()-1)).append(count);
		
		return compressed.length()<input.length() ? compressed.toString() : input;
	}

}
