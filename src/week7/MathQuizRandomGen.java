/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author michael.tomchak
 */
public class MathQuizRandomGen {

    private final static int problem = (13 % 3 * 2);
    private final static int answer = 2;
    private final static int NUM_ATTEMPTS = 3;

    public static void main(String[] args) {
        System.out.println("**Math Checker**");
        String equation = ("13 % 3 * 2");
        int attempts = 0;
        int RANDOM_NUMBER_MAX = 100;
        Random randGenerator = new Random();
        int randNum = randGenerator.nextInt(RANDOM_NUMBER_MAX);
        System.out.println("Compute the value of problem " + randNum);

        System.out.println("Compute the value of " + equation);

        Scanner scanner = new Scanner(System.in);
        int input;
        boolean isCorrect = false;

        do {
            input = scanner.nextInt();
            isCorrect = (input == answer);
            if (isCorrect) {
                System.out.println("Correct! Good job.");

            } else {
                System.out.println("Incorrect! Try again.");
            }
          
            attempts = attempts + 1;
            System.out.println("Attempts: " + attempts);
            System.out.println("Number of Attempts: " + NUM_ATTEMPTS);
        
        } while (!isCorrect && (attempts < NUM_ATTEMPTS));
        

    } // close main
} // close class
