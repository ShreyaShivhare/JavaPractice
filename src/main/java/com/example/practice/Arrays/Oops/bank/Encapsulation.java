/*Encapsulation - data/properties and functions are combined together under one unit(class).
//Access Modifiers
  1] public -  accessible to every classes or package
  2] private - accessible to only that class
  3] default - (when we donot define any modifiesr like " String name" only)
               accessible only within that package ,not other package can acccess.
  4] protected - accessible within the package and other package subclassess can access.
*/
package com.example.practice.Arrays.Oops.bank;

class Account{
    public String name;
    protected String email;
    private String password; //only account class can access it 
    //other class can access by using getteres and setters.

}

public class Encapsulation{

    public static void main(String args[]){
        Account a1 = new Account();
        a1.name = "Shreya Shivhare";
        a1.email = "shreya@gmail.com";
    }
}
