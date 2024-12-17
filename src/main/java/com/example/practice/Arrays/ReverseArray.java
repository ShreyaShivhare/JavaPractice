package com.example.practice.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {12,44,23,65,98,103};
		reverseArray(arr, 0, arr.length-1);
		System.out.println("The Reverse Array is: ");
		for(int num : arr) {
			System.out.println(num+ " ");
		}
		
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
