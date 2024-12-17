package com.example.practice.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4,5,0,0,0,0};
		int B[] = {4,5,6,7};
		int m = 5;
		int n = 4;
		mergeArrays(A, m, B, n);
		for(int num : A) {
			System.out.print(num+ " ");
		}
		
	}
	
	public static void mergeArrays(int A[], int m, int B[], int n) {
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		
		while(k>=0) {
			if(j<0 || (i>=0 && A[i]>=B[j])) {
				A[k--] = A[i--];
			}else {
				A[k--] = B[j--];
			}
		}
	}
}
