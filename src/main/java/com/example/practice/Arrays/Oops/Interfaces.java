package com.example.practice.Arrays.Oops;
//pure abstraction- hides all unnecessary info
// All the field in interfaces are public, static and final by default.
//all methods are public and abstract.
//** interfaces support functionally of multiple inheritance */
interface Animal1{
   void walk();
   void eat();
   //Animal(){} // Shows error as interfaces do not have constructor
   //void ear(){} //does not have non abstract function.
}

interface Herbivorus{

}

 class Horse1 implements Animal1 , Herbivorus{ //multiple inheritance
    public void walk(){
        System.out.println(" Horse has four legs");
    }

@Override
public void eat() {
	// TODO Auto-generated method stub
	
}
}

public class Interfaces{
    public static void main(String args[]){
        Horse1 h = new Horse1();
        h.walk();

    }
}