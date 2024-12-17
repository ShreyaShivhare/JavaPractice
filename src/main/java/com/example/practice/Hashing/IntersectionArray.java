package com.example.practice.Hashing;

import java.util.HashSet;

public class IntersectionArray{

    public static int[] intersectionArray(int nums1[], int nums2[]){
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for(int j=0; j<nums2.length; j++){
            set2.add(nums2[j]);
        }

        set1.retainAll(set2);
        int[] output = new int[set1.size()] ;
        int count = 0;
        for(int s : set1){
            output[count] = s;
        }
     
        return output;
        //System.out.println(set1);
    }

    public static void main(String args[]){
        int nums1[] = {2,4,6,8};
        int nums2[] = {4,6,8,9,10};
        intersectionArray(nums1, nums2);

    }
}