package com.example.practice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
//	public static int[] twoSum(int arr[], int target) {
//		for(int i =0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] + arr[j] == target) {
//					return new int[] {i,j};				
//					}
//			}
//		}
//		return null;
//		
//	}
	
	public static boolean twoSum(int arr[], int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int complement = target - arr[i];
			if(map.containsKey(complement)) {
				return true;
			}
			map.put(arr[i], i);
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {2,7,11,15};
		int target = 9;
		System.out.println(twoSum(arr, target));
		

	}

}
