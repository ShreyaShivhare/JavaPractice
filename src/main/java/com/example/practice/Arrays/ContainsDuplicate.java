package com.example.practice.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		//int arr[] = {1,3,2,6,3,5};
		int arr[] = {2,3,4,5,6,7};
		System.out.println("The Array contains duplicates ? "+duplicates(arr));
		

	}
	
	public static boolean duplicates(int arr[]) {
		//Arrays.sort(arr);
		
		HashSet<Integer> set =  new HashSet<>();
		for(int i =0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				return true;
			}
			set.add(arr[i]);
		}
		return false;
	}

}
