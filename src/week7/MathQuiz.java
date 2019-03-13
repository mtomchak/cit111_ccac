/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author michael.tomchak
 */
public class MathQuiz {
    
    private final static int problem = (13 % 3 * 2);
    private final static int answer = 2;
    
    public static void main(String[] args) {
        System.out.println("**Math Checker**");
       String equation = ("13 % 3 * 2");
         int RANDOM_NUMBER_MAX = 100; 
       Random randGenerator = new Random();
       int randNum = randGenerator.nextInt(RANDOM_NUMBER_MAX);
       System.out.println("Compute the value of problem " + randNum);
       
        System.out.println("Problem: " + equation);
        
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean isCorrect = false;
      do{
         input = scanner.nextInt();
        isCorrect = (input == answer);
        if (isCorrect) {
            System.out.println("Correct! Good job.");
            
        }else{
            System.out.println("Incorrect! Try again.");
        }
        }while (!isCorrect);   
    } // close main
} // close class
