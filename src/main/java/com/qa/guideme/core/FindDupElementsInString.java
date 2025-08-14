package com.qa.guideme.core;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDupElementsInString {
	public static void main(String[] args) {

		String arr[] = { "Java", "python", "C++", "C", "Java" };

		Set<String> dup = new LinkedHashSet<String>();
		for (String a : arr) {
			if (!dup.add(a)) {
				System.out.println("duplicate element is:" + a);
			}
		}

		// by using hashMap
		Map<String, Integer> dupele = new HashMap<String, Integer>();
		for (String values : arr) {
			Integer count = dupele.get(values);
			if (count == null) {
				dupele.put(values, 1);
			} else {
				dupele.put(values, ++count);
			}

		}
		// get the values
		Set<Entry<String, Integer>> entryset = dupele.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				System.out.println("duplicate element is by using map:" + entry.getKey());
			}
		}
	}
}