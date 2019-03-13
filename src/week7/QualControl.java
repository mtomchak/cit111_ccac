/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Random;

/**
 *
 * @author michael.tomchak
 */
public class QualControl {
    public static void main(String[] args) {
        final int UPPER_END = 100;
        // creating random generator OBJECT
        Random randGenerator = new Random();
       System.out.println(randGenerator.nextInt(UPPER_END));
        
    } // close main
} // close class
