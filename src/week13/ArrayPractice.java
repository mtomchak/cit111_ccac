/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Scanner;

/**
 *
 * @author michael.tomchak
 */
public class ArrayPractice {

    public static void main(String[] args) {
        String[] cars = new String[8];
        cars[0] = "Ford Fiesta";
        cars[1] = "Kia Rio";
        cars[2] = "Nissan Altima";
        cars[3] = null;
        cars[4] = "Chevy Malibu";
        cars[5] = "Hyundai Elantra";
        cars[6] = "Nissan Murano";
        cars[7] = "Jeep Wrangler";
      
        userInteraction(cars);

        int counter = 0;
        while (counter < cars.length) {
            System.out.println("Value at bin index " + counter + " is " + cars[counter]);
            counter = counter + 1;
        } // close while

        System.out.println("Loop over array with for");
        // loop over array with for loop
        // for(initialize ; boolean check ; increment)
        // for(runs once at start ; checked each time ; run after each loops)
        for (int i = 0; i < cars.length; i = i + 1) {
            System.out.println("Value at bin index " + i + " is " + cars[i]);
        } // close for

        // a method that takes in a String[] and allows user to populate values
    } // close main
    
    public static void userInteraction(String[] paramarray) {
        //display size
        int arraySize = paramarray.length;
        System.out.println("The size is: " + arraySize);
        // ask user which bin they want to access
        System.out.println("Which bin would you like to access?");
        // make a Scanner object
        Scanner scanner = new Scanner(System.in);
        // read in an int with scan.nextInt()
        int bin;
        bin = scanner.nextInt();
        // modify user input to work with 0-indexed arrays (subtract 1)
        bin = bin - 1;
        // look up value in array
      System.out.println("Your bin is: " + paramarray[bin]);
        // display to user
    } // close method userInteraction
} // close class
