/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author michael.tomchak
 */
public class SimpleMethod {
    // declaring a class member variable
    static String student = "Mike";
   
     public static void printStatement() {
         System.out.println("**INSIDE printSTATEMENT**");
         System.out.println("You miss 100% of the shots you don't take.");
          } // end method printStatement
    
      public static void main(String[] args) {
        System.out.println("Inside main");
        // a local variable only available in main
        System.out.println(student);
        printStatement();
        generateBigNumber();
        System.out.println("Back inside main");
    } // close main
    
    // A method is a named block of code that does a single task
   // (aka function,routine)
   
    public static void generateBigNumber() {
        System.out.println(student);
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100, r);
        System.out.println(bigInt);
    } // close method generateBigNumber
} // close class
