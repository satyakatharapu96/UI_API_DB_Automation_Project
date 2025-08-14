package com.qa.guideme.core;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		String str = "Satyannarayana katharapu";
		String revstr = "";
		String words[] = str.split(" ");
		for (String w : words) {
			String revword = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				revword = revword + w.charAt(i);
			}
			revstr = revstr + revword + " ";
		}
		System.out.println("revword String is:" + revstr);

	}

}