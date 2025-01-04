package com.sk.string.challenges;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithOutRepeatingCharacter {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter String");

	    String input = myObj.nextLine();  // Read user input
	    System.out.println("Original String is : " + input);
	    int output = lengthOfLongestSubstring(input);
	    System.out.println("Longest Sub-String length is : " + output);
	}
	private static int lengthOfLongestSubstring(String input){
		int left = 0;
		int maxLength = 0;
		Set<Character> set = new LinkedHashSet<>();
		for(int right = 0; right<input.length(); right++) {
			while(set.contains(input.charAt(right))) {
				set.remove(input.charAt(left));
				left++;
			}
			set.add(input.charAt(right));
			System.out.println(set);
			int currentLength = right-left+1;
			maxLength = Math.max(maxLength, currentLength);
		}
		return maxLength;
	}

}
