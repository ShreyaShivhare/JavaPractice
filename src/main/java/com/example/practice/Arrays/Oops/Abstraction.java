package com.example.practice.Arrays.Oops;
abstract class Animal{    //concept , imaginary kind of thing
   abstract void walk();
   public void eat(){
    System.out.println("Animal eats"); 
    //abstract class can have both abstract or normal methods
    //can have constructor and static methods
   }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse can walk");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken can walk");
    }
}
public class Abstraction{

    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.walk();
        
//        Animal a = new Animal();
//        a.walk();  //throw runtime error as its abstract - it can not be instantiated

    }
    
}