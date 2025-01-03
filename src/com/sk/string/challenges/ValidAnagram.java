package com.sk.string.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter String1 ");

	    String input1 = myObj.nextLine();  // Read user input
	    System.out.println("Input String1 is : " + input1);
	    System.out.println("Enter String2 ");
	    String input2 = myObj.nextLine();  // Read user input
	    System.out.println("Input String2 is : " + input2);
	    String output = validAnagram(input1,input2)  ? "Yes Valid Anagram":"NO Not a Valid Anagram";
	    System.out.println(input1+" && "+input2+" Both String is Valid Anagram ? : " + output);
	}

	private static boolean validAnagram(String input1,String input2) {
		if(input1.length() != input2.length()) return false;
		
	/*	char[] ch1 = input1.toCharArray();
		char[] ch2 = input2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	*/
		int[] count = new int[26];
		for(int i = 0; i<input1.length(); i++) {
			count[input1.charAt(i)-'a']++;
			count[input2.charAt(i)-'a']--;
		}
		for(int i = 0; i<26; i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
