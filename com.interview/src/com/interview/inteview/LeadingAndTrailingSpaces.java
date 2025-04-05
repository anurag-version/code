package com.interview.inteview;

public class LeadingAndTrailingSpaces {
public static void leading(String s1){
	char[] charArray = s1.toCharArray();
	String s2="";
	for(int i=0;i<charArray.length;i++) {
		if(i==0||i==charArray.length-1) {
			if(charArray[i]==' ') {
				continue;
			}else {
				s2+=charArray[i];
			}
		}else {
			s2+=charArray[i];
		}
	}
	System.out.println(s2);
}
public static void main(String[] args) {
	String s1=" abc anurag ";
	System.out.println(s1);
	leading(s1);
}
}
