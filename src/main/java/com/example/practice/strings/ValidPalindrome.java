package com.example.practice.strings;

import java.util.stream.IntStream;

public class ValidPalindrome {
	
//	public static boolean isPalindrome(String s){
//		int start = 0;
//		int end = s.length()-1;
//		
//		while(start < end) {
//			char charFirst = s.charAt(start);
//			char charLast =  s.charAt(end);
//			
//			if(!Character.isLetterOrDigit(charFirst)) {
//				start++;
//			}else if(!Character.isLetterOrDigit(charLast)) {
//				end--;
//			}else {
//				if(Character.toLowerCase(charFirst) != Character.toLowerCase(charLast)) {
//					return false;
//				}
//			}
//			start++;
//			end--;
//			
//		}
//		return true;
//		
//	}
	
	//Using Java 8
	
	public static boolean isPalindrome(String s) {
		String str = s.replaceAll("\\s+", " ").toLowerCase();
		return IntStream.range(0, str.length() /2).allMatch(i -> str.charAt(i) == str.charAt(str.length() -i -1));
	}

	public static void main(String[] args) {
		String s = "a a b b a";
		System.out.println(isPalindrome(s));
	}

}
