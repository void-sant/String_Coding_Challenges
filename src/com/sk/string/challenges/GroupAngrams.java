package com.sk.string.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAngrams {

	public static void main(String[] args) {
		String[] inputs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(inputs));
	}

	private static List<List<String>> groupAnagrams(String[] inputs) {
		Map<String,List<String>> map = new HashMap<>();
		for(String str : inputs) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String key = new String(charArray);
			map.putIfAbsent(key, new ArrayList<>());
			map.get(key).add(str);
	        //System.out.println(map);
		}
		return new ArrayList<>(map.values());
	}

}
