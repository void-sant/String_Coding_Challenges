package com.sk.string.challenges;

public class Reverse_A_String {

	public static void main(String[] args) {
		String str = "hello";
		String reversed = reverseStringWithPredifined(str);
		System.out.println("Original String is: "+str+" , -> Reversed String is: "+reversed);
		
		String reversed2 = reverseStringWithoutPredefined(str);
		System.out.println("Original String is: "+str+" , => Reversed String is: "+reversed2);


	}

	private static String reverseStringWithoutPredefined(String str) {
		String reversed = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reversed = reversed+ str.charAt(i);
		}
		return reversed;
	}

	private static String reverseStringWithPredifined(String str) {
		StringBuilder sb =  new StringBuilder(str);
		String reversed = sb.reverse().toString();
		return reversed;
	}

}
