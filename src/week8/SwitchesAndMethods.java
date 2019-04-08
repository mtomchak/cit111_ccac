/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author michael.tomchak
 */
public class SwitchesAndMethods {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**Switches and Methods**");
        System.out.println("Options: ");
        int options = scanner.nextInt();
         Random randGenerator = new Random();
         switch (options) {
             case 1:
                 System.out.println("Print a special statment");
                 System.out.println("Have a good day!");
                 break;
             case 2:
                 int randNum = randGenerator.nextInt();
                 System.out.println("Generate a really big random number: " + randNum);
                 break;
             case 78:
                 System.out.println("Get me out of here");
                 break;
             default:
                 break;
         } // close switching block
    } // close main
} // close class
