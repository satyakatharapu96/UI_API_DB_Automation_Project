package com.qa.guideme.core;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		System.out.println(isAnagram("cat", "act"));
		System.out.println(isAnagram("race", "care"));
		System.out.println(isAnagram("li st eN", "SILenT"));
		System.out.println(isAnagram("Satya", "Suresh"));
	}

	// cat,act,race,care
	public static boolean isAnagram(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);

	}

}
