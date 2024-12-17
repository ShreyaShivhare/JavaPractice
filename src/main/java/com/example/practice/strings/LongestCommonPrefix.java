package com.example.practice.strings;

public class LongestCommonPrefix {
	
	public static String lcp(String[] str) {
		if(str == null || str.length==0)
		{
			return " "; 
		}
		
		String prefix = str[0];
		for(int i = 1; i<str.length; i++) {
			while(str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if(prefix.isEmpty()) {
					return "Not any";
				}
			}
		}
		return prefix;
		
	}
	public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(lcp.lcp(strs1)); // "fl"
        System.out.println(lcp.lcp(strs2)); // ""
    }

}
