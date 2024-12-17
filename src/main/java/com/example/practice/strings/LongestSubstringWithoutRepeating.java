package com.example.practice.strings;

//O(n): The algorithm processes each character in the string exactly once. 
//The right pointer traverses the string from left to right, and the left pointer only moves forward. 
//Each character is added and removed from the HashSet at most once, resulting in a linear time complexity.
import java.util.HashSet;

import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s));
    }
}
