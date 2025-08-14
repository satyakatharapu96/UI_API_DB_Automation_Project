package com.qa.guideme.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNumberOfDupWordsInString {

	public static void main(String[] args) {
		duplicatewordsInString("java With selenium And JAVA with restassured java");
	}

	public static void duplicatewordsInString(String str) {
		String words[] = str.split("\\s+");
		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		for (String word : words) {
		String w=word.toLowerCase();
			if(wordcount.containsKey(w)) {
				wordcount.put(w, wordcount.get(w)+1);
			}else {
				wordcount.put(w, 1);
			}
		}

		// get the values
		Set<String> wordsinString = wordcount.keySet();
		for (String value : wordsinString) {
			if (wordcount.get(value)>1) {
				System.out.println(value + " word is-->:" + wordcount.get(value));
			}
		}


		}

	}

