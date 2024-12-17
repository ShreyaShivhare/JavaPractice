package com.example.practice.Arrays.Oops;
//To use same function for different works. poly means Many morphism means forms.

class Student1 {
    String name;
    int age;
//we can create many function with same name but they should have different return type or different count /
//data type of argument

    public void printInfo(String name){
        System.out.println(name);
    }
    public  void printInfo(int age){
        System.out.println(age);
        
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
        
    }
}
public class Polymorphism{

    public static void main(String args[]){
        Student1 s1 = new Student1();
        s1.name = "Aman";
        s1.age = 19;

        s1.printInfo(s1.age);

    }
}