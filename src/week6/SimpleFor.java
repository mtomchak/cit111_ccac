/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;
/**
 *
 * @author michael.tomchak
 */
public class SimpleFor {
     public static void main(String[] args) {
        
        int loopControl;
        String Phrase;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many loops shall I print?");
        loopControl = scanner.nextInt();
        System.out.println("Enter phrase");
        Phrase = scanner.next();
        
        for(int numLoops = 0; numLoops < loopControl; numLoops = numLoops + 1 ) {
        System.out.println(Phrase + " " +  numLoops);
        
        
        } // close while
        System.out.println("...After the while loop");
    } // close main
} // close class

