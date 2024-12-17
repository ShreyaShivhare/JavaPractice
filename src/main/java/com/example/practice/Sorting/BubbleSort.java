package com.example.practice.Sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[], int n){
    int i, j, temp;
    boolean swapped =false;

    for(i=0; i<=n-1; i++){
       for(j =i+1; j<=n-1;j++){
        if(arr[i] > arr[j]){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            swapped = true;
        }
       }
       if(swapped == false){
        break;
       }
    }
    } 

    public static void printArr(int arr[], int size){
         int i;
         for(i=0; i<size; i++){
            System.out.print(arr[i]+" ");
         }
    }

    public static void main(String[] args) {
        //int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int arr[] = {6};
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted Array:");
        printArr(arr, n);
    }
}
