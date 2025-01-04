package com.sk.string.challenges;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstNonRepeatCharacter {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter String ");

	    String input = myObj.nextLine();  // Read user input
	    System.out.println("Original String is : " + input);
        char firstNonRepeatchar = findFirstNonRepeatCharacter(input);
        System.out.println("The First Non-Repeat Character is : "+firstNonRepeatchar);
	}
	private static char findFirstNonRepeatCharacter(String input){
		Map<Character,Integer> charOccurance = new LinkedHashMap<>();
		for(char ch : input.toCharArray()) {
			charOccurance.put(ch, charOccurance.getOrDefault(ch, 0)+1);
			//System.out.println(charOccurance);
		}
		for(Map.Entry<Character, Integer> entry : charOccurance.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '_';
	}

}
