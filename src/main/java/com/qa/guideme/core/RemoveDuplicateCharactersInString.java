package com.qa.guideme.core;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersInString {
	public static void main(String[] args) {
		
		String str="Satyannarayana katharapu";
		String result="";
		Set<Character>set=new LinkedHashSet<>();
		for(char c:str.toCharArray()) {
			if(!set.contains(c)) {
				set.add(c);	
				result=result+c;
			}
		}
		System.out.println("After removed duplicate characters:"+result);
			
		}
		

}
