package com.example.practice.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.fasterxml.jackson.databind.introspect.AnnotationCollector.TwoAnnotations;

//int[] arr = {124,233,545,473,449,819,231,947,267,472,347,348,267,108,380,794,122,309,105,238,578,473};
//smallest odd  number
//int[] arr1 = {1,4,5,6,8,10,11,15};
//int[] arr2 = {2,3,7,9,12,13,14};
//Merge the sorted arrays in one sorted array

public class Demo1 {
	
	public static void mergeArrays(int arr1[], int arr2[], int arr3[]) {
		int n1= arr1.length;
		int n2= arr2.length;
		int i =0, j=0, k=0;
		while(i<n1 &&j<n2) {
			if(arr1[i]<arr2[j]) {
				arr3[k++] = arr1[i++];
			}else {
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i<n1) {
			arr3[k++] = arr1[i++];
		}
		while(i<n2) {
			arr3[k++] = arr2[i++];
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,4,5,6,8,10,11,15};
		int[] arr2 = {2,3,7,9,12,13,14};
		int[] arr3 = new int[arr1.length+arr2.length];
		
		mergeArrays(arr1, arr2, arr3);
		
		for(int val : arr3) {
			System.out.print(val + " ");
		}
	}

	
	
}
