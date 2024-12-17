package com.example.practice.strings;

import java.util.Arrays;

public class ValidAnagram {
	
	public static boolean isAnagramSort(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
		
	}
	//METHOD 2
	private static final int CHARACTER_RANGE = 256;
	public static boolean isAnagramCount(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		int[] count = new int[CHARACTER_RANGE];
		for(int i=0; i<s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int i : count) {
			if(i!=0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "a b c d";
		String s2 = "d a c b";
		
		System.out.println(isAnagramSort(s1, s2));
		System.out.println(isAnagramCount(s1, s2));

	}

}
