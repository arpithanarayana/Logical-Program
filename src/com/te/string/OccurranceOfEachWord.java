package com.te.string;

public class OccurranceOfEachWord {
	public static void main(String[] args) {
		String s = "hello hello hii byee welcome";
		String[] s1 = s.split(" ");
		String[] s2 = s.split(" ");
		
		for(int i=0 ; i<s1.length ; i++) {
			int c=0;
			for(int j=0 ; j<s2.length ; j++) {
				if(s1[i]==s2[j]) {
					c++;
					s2[j] = "\0";
				}
			}
			if(c>0) {
				System.out.println(s1[i] + "---> " + c);
			}
		}
	}

}
