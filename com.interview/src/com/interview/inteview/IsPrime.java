package com.interview.inteview;

public class IsPrime {
public static String isPrime(int n) {
	if(n<2) {
		return "not prime";
	}else if(n==2) {
		return "is prime";
	}else {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return "is not prime";
			}
		}
	}
	return "is prime";
}
public static void main(String[] args) {
	String prime = isPrime(12);
	System.out.println(prime);
}
}
