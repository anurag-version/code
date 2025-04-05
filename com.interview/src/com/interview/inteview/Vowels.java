package com.interview.inteview;

import java.util.ArrayList;
import java.util.HashMap;

public class Vowels {
	public static boolean isVowel(String value) {
		ArrayList<Character> arrayList = new ArrayList<Character>();
		arrayList.add('a');
		arrayList.add('e');
		arrayList.add('i');
		arrayList.add('o');
		arrayList.add('u');
		
		for(int i=0;i<value.length();i++) {
			if(arrayList.contains(value.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	 public static void main(String[] args) {
		String s1="tv";
		boolean vowel = isVowel(s1);
		System.out.println(vowel);
	}


}
