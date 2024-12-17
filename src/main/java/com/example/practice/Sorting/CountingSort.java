package com.example.practice.Sorting;

public class CountingSort {

    public static int[] countSort(int inputArr[]){
        int n = inputArr.length;
        int M=0;

        //Find the maximum value in the input array
        for(int i=0; i<n; i++){
            M = Math.max(M, inputArr[i]);
        }
        // Create a count array of size (max + 1)
        int[] countArr = new int[M+1];
 
        //increment the count // Increment the count for each value in the input array
        for(int i=0; i<n; i++){
            countArr[inputArr[i]]++;
        }

        //// Modify the count array to store the cumulative counts
        for(int i=1; i<=M; i++){
            countArr[i] += countArr[i-1];
        }

        //output arrat
        int[] outputArr = new int[n];
        for(int i=n-1; i>=0; i--){
            outputArr[countArr[inputArr[i]]-1] = inputArr[i]; // Place elements in the output array
            countArr[inputArr[i]]--; // Decrease the count for the current element
        }
        
        return outputArr;

    }
    public static void main(String[] args) {
        int[] inputArr = {4, 3, 12, 1, 5, 5, 3, 9};
        int[] outputArr = countSort(inputArr);

        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(outputArr[i] + " ");
        }
    }
    
}
