package com.qa.guideme.core;

public class PalindromeStringAndNumber {
	public static boolean palindromeString(String str) {
		if (str == null) {
			return false;
		}
		String rev = "";
		// madam
		str=str.toLowerCase();
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("given number is palindrome");

		} else {
			System.out.println("given number is not palindrome");
		}
		return true;
	}

	public static void main(String[] args) {
		palindromeString("Satya");
		palindromeString("MADAM");
		palindromeString("racecar");
	}
}
