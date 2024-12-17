package com.example.practice.Hashing;

import java.util.HashSet;

public class UnionArray{

    public static void unionArray(int nums1[], int nums2[]){
        HashSet<Integer> set = new HashSet<>();

        // int i=nums1.length;
        // int j=nums2.length;
        for(int i=0;i<nums1.length; i++ ){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length; j++ ){
            set.add(nums2[j]);
        }

        System.out.println(set.size());
        System.out.println(set);



    }

    public static void main(String args[]){
        int nums1[] = {2,4,6,8};
        int nums2[] = {4,6,8,9,10};
        unionArray(nums1, nums2);

    }

}