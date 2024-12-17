package com.example.practice.Arrays.Oops;
//when a class inherits the properties of a different class which becomes the base class
//base class

class Shape{
    //String color;
    public void area(){
         System.out.println("Area");
    }
}
//single inheritance
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}

//Multilevel Inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}

//hierarchial Inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

//hybrid - diff types of inheritance happens together.

//multiple - not in java but in c++


public class Inheritance{
 public static void main(String args){
    //Triangle t1 = new Triangle();
    // t1.color = "red";

    }
}