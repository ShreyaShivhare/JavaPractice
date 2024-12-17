package com.example.practice.Arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {12,23,34,45,56,67};
		int k = 5;
		rotateArray(arr, 5);
		System.out.println(Arrays.toString(arr));
	}
	public static void rotateArray(int arr[], int k) {
		k %= arr.length;
		reverseArray(arr, 0, arr.length-1);
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, arr.length-1);
	}
	
	public static void reverseArray(int arr[], int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
