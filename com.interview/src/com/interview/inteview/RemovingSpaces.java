package com.interview.inteview;

public class RemovingSpaces {
	public static String removingSpaces(String s1) {
		String value="";
		char[] charArray = s1.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]==' ') {
				for(int j=i;j<charArray.length-1;j++) {
					charArray[j]=charArray[j+1];
				}
			}
		}
		for(int k=0;k<charArray.length-1;k++) {
			value+=charArray[k];
		}
	return value;
	}
	public static void main(String[] args) {
	String s1="hello world";
	String removingSpaces = removingSpaces(s1);
	System.out.println(removingSpaces);
	}

}
