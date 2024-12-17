package com.example.practice.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapping{

    public static void main(String args[]){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("Us", 30);
        map.put("China", 150);

        map.put("China", 180);  //will update if already exists

        System.out.println(map);

        // if(map.containsKey("China")){
        //     System.out.println("Present");
        // }else{
        //     System.out.println("Not Present");
        // }

        // System.out.println(map.get("China"));
        // System.out.println(map.get("Indonesia"));

        // for(Map.Entry<String, Integer> e : map.entrySet()){

        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        //     System.out.println(e);
        // }

        // map.remove("China");

        // System.out.println(map);
        
        System.out.println(map.size());



    }
}