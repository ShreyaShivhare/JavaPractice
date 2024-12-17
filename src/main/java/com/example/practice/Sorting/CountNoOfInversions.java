package com.example.practice.Sorting;

public class CountNoOfInversions {
	
	public static int countInversion(int arr[]) {
		return mergeSortAndCount(arr, 0, arr.length-1);
	}
	
	
	public static int mergeSortAndCount(int[] arr, int left, int right) {
		int count = 0;
		if(left<right) {
			int mid = (left+right)/2;
			
			count = count+mergeSortAndCount(arr, left, mid);
			count = count+mergeSortAndCount(arr, mid+1, right);
			
			count = count+mergeAndCount(arr, left, mid, right);	
		}
		return count;
	}


	private static int mergeAndCount(int[] arr, int left, int mid, int right) {
		//temp variable
		int[] leftArr = new int[mid-left +1];
		int[] rightArr = new int[right-mid];
		
		//Copy the elements from the original array arr to leftArr and rightArr.
		for(int i=0; i<leftArr.length; i++) {
			leftArr[i] = arr[left + i];
		}
		for(int i=0; i<rightArr.length; i++) {
			rightArr[i] = arr[mid+1 +i];
		}
		
//		Initialize pointers for leftArr (i), rightArr (j), and the merged array (k).
//		Initialize a counter swaps to count the number of inversions.
		int i=0, j=0, k=left; 
		int swaps=0;
		
//		Compare elements from leftArr and rightArr and merge them back into arr.
//		If an element from leftArr is less than or equal to an element from rightArr, it is placed in arr.
//		If an element from rightArr is less than an element from leftArr, it is placed in arr, and the number 
//		of inversions is incremented by the number of remaining elements in leftArr.
		while (i < leftArr.length && j < rightArr.length) {
          if (leftArr[i] <= rightArr[j]) {
              arr[k++] = leftArr[i++];
          } else {
              arr[k++] = rightArr[j++];
              swaps += (mid + 1) - (left + i);
          }
        }
		
		//Add remaining elements
		while (i < leftArr.length)
          arr[k++] = leftArr[i++];

	     while (j < rightArr.length)
	          arr[k++] = rightArr[j++];
	
	      return swaps;
	}
	
//	private static int mergeAndCount(int[] arr, int left, int mid, int right) {
//        int[] leftArr = new int[mid - left + 1];
//        int[] rightArr = new int[right - mid];
//
//        for (int i = 0; i < leftArr.length; i++)
//            leftArr[i] = arr[left + i];
//        for (int i = 0; i < rightArr.length; i++)
//            rightArr[i] = arr[mid + 1 + i];
//
//        int i = 0, j = 0, k = left, swaps = 0;
//
//        while (i < leftArr.length && j < rightArr.length) {
//            if (leftArr[i] <= rightArr[j]) {
//                arr[k++] = leftArr[i++];
//            } else {
//                arr[k++] = rightArr[j++];
//                swaps += (mid + 1) - (left + i);
//            }
//        }
//
//        while (i < leftArr.length)
//            arr[k++] = leftArr[i++];
//
//        while (j < rightArr.length)
//            arr[k++] = rightArr[j++];
//
//        return swaps;
//    }


	//BRUTE FORCE APPROACH
//	public static int countInversion(int arr[]) {
//		int n = arr.length;
//		int count = 0;
//		for(int i=0; i<n; i++) {
//			for(int j= i+1; j<n; j++) {
//				if(arr[i]>arr[j]) {
//					count++;
//				}
//			}
//		}
//		return count;
//	}

	public static void main(String[] args) {
		int arr[] = {1, 20, 6, 4, 5 };
		System.out.println("The Number of Inversions are : "+countInversion(arr));

	}

}
