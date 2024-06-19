package com.te.string;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubsequence {
	public static int longest(String s) {
		int maxlength = 0;
		int start = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int end = 0 ; end<s.length() ; end++) {
			char currentIndex = s.charAt(end);
			if(map.containsKey(currentIndex) && map.get(currentIndex)>=start) {
				start = map.get(currentIndex)+1;
			}
			map.put(currentIndex, end);
			maxlength = Math.max(maxlength, end-start+1);
		}
		return maxlength;
	}
	public static void main(String[] args) {
		String s = "abcabcdef";
		int longest = longest(s);
		System.out.println(longest);
	}

}
