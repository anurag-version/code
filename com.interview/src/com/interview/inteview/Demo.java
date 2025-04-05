package com.interview.inteview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		String s1 = "anurag anurag biradar anurag";
		int count = 1;
		String[] split = s1.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		for (int i = 0; i < split.length; i++) {
			for (int j = 0; j < split.length; j++) {
				if (i != j) {
					if (split[i].equalsIgnoreCase(split[j])) {
						count++;
					}
				}
			}
			hashMap.put(split[i], count);
			count = 1;
		}
		System.out.println(hashMap);
//		String[] split = s1.split(" ");
//		Map<String, Long> collect = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
//		Map<String, Long> collect = Arrays.stream(s1.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
		// Map<Character, Long> collect = s1.chars().mapToObj(c-> (char)c).filter(i->
		// i!='
		// ')collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		Map<Character, Long> collect = s1.chars().mapToObj(c-> (char)c).filter(i-> !Character.isWhitespace(i)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect);
	}
}
