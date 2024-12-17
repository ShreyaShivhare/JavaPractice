package com.example.practice.Arrays;

// n = n*(n+1) /2
public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,0};
		System.out.println("The missing number is :"+missingNumber(arr));
		
	}
	
	public static int missingNumber(int arr[]) {
		int sum = 0;
		int n = arr.length;
		int orgsum = n*(n+1)/2;
		
		for(int i=0; i<n; i++) {
			sum = sum + i;
		}
		return orgsum-sum;
		
		
	}

}
