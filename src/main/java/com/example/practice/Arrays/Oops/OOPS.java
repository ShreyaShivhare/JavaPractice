// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Writing Something");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }
// }
package com.example.practice.Arrays.Oops;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){

        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){
        
    }
}

public class OOPS{
    public static void main(String args[]){

        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "Gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "Gel";

        // pen1.printColor();
        // pen2.printColor();
        //pen1.write();

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 22;

        Student s2 = new Student(s1);
        

        s1.printInfo();
        s2.printInfo();

    }
}