package com.sk.string.challenges;

import java.util.Scanner;

public class CountVowelConsonats {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter String ");

	    String input = myObj.nextLine();  // Read user input
	    System.out.println("Original String is : " + input);
        countVowelsConsonants(input);
	}

	private static void countVowelsConsonants(String input) {
		int vowels = 0, consonants = 0;
		input = input.toLowerCase();
		for(char ch : input.toCharArray()) {
			if("aeiou".indexOf(ch) != -1) {
				vowels++;
			}
			else if (ch >= 'a' && ch <= 'z') {
				consonants++;		
			}
		}
		System.out.println(input+" Vowels count is : "+vowels+", Consonants: "+consonants);;
	}
	

}
