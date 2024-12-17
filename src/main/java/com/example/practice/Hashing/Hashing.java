package com.example.practice.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing{

    public static void main(String args[]){

        HashSet<Integer> set = new HashSet<>();
        
        //Insert
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(11); // will not be added as only unique elements are added
        System.out.println(set);

        // //search
        // if(set.contains(22)){
        //     System.out.println("True");
        // }

        System.out.println(set.size());

        //Iterator
        Iterator it = set.iterator();
        //hasNext() //next()
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        set.remove(3);
        System.out.println(set);


    }
    
}