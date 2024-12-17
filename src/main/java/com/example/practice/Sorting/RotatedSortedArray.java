package com.example.practice.Sorting;

public class RotatedSortedArray {
	
	public static int searchInRotatedSortedArray(int arr[], int target) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
		
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[left] <= arr[mid]) {
				if(arr[left] <= target && target < arr[mid]) {
					right = mid-1;
				}else {
					left = mid + 1;
				}
			}else {
				if(arr[mid] < target && target <= arr[right]) {
					left = mid+1;
				}else {
					right = mid-1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {11,44,23,67,88,99};
		int target = 55;
		
		System.out.println(searchInRotatedSortedArray(arr, target));
		
	}

}