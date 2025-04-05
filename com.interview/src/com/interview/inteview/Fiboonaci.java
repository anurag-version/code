package com.interview.inteview;

public class Fiboonaci {
public static void fibb(int n) { 
	int i=0;
	int start=0;
	int next=1;
	int result=start+next;
	while(i<n) {
		System.out.print(start+" ");
		start=next;
		next=result;
		result=start+next;
		i++;
		
	}
	
}
public static void main(String[] args) {
	fibb(10);
}
}
