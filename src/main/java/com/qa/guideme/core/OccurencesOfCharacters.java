package com.qa.guideme.core;

import java.util.HashMap;
import java.util.Map;

public class OccurencesOfCharacters {
	public static void occurencesOfCharacter(String str) {
		char ch[] = str.toCharArray();
		Map<Character, Integer> charmap = new HashMap<>();
		for (Character c : ch) {
			if (charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c) + 1);
			} else {
				charmap.put(c, 1);
			}
		}
		System.out.println("occurence of character-------->" + charmap);
	}

	public static void main(String[] args) {
		occurencesOfCharacter("Satyannarayana katharapu");
	}

}
