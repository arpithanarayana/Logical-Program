package com.te.string;

import java.util.HashMap;
import java.util.Map;

public class OccurranceOfEachCharacter {
	public static Map<Character, Integer> occurrance(String s){
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0 ; i<s.length() ; i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		return map;
		
	}
	public static void main(String[] args) {
		String s = "hello";
		Map<Character, Integer> occurrance = occurrance(s);
		System.out.println(occurrance);
//		char[] ch1 = s.toCharArray();
//		char[] ch2 = s.toCharArray();
//		for(int i=0 ; i<ch1.length ; i++) {
//			int c=0;
//			for(int j=0 ; j<ch2.length ; j++) {
//				if(ch1[i]==ch2[j]) {
//					c++;
//					ch2[j] = '\0';
//				}
//			}
//			if(c>0) {
//				System.out.println(ch1[i] + "--->" + c);
//			}
//		}
	}

}
