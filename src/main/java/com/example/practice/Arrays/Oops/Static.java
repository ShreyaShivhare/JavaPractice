package com.example.practice.Arrays.Oops;
//by adding static keyword we make it same for all the objects.
//Like in this school name is same for all the students.
class Student2{
    String name;
    static String school;
}
public class Static{
    public static void main(String args[]){
        Student2.school = "ABC"; // direct we can putvalue
        Student s1 = new Student();
        s1.name = "arun";
    
        //System.out.println(s1.school);
        
    }
}