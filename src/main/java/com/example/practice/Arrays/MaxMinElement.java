package com.example.practice.Arrays;

import java.util.Arrays;

public class MaxMinElement {

	public static void main(String[] args) {
		int arr[] = {11,65,33,90,21,73};
		int[] result = MaxAndMin(arr);
        System.out.print("Min and Max elements are: " + result[0] + " and " + result[1]);

	}
	
	public static int[] MaxAndMin(int arr[]){
		Arrays.sort(arr);
		int n = arr.length;
		return new int[] {arr[0], arr[n-1]};
		
	}

}
