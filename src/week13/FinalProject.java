/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author michael.tomchak
 */
public class FinalProject {
    static Scoreboard board;
     
    // main class with objects to print out words
     public static void main(String[] args) {
          int RANDOM_NUMBER_MAX = 9;
           int RANDOM_NUMBER_LOW = 1; 
          Random randGenerator = new Random();
        int randNum = randGenerator.nextInt(RANDOM_NUMBER_MAX + RANDOM_NUMBER_LOW);
        int randNumNew = randGenerator.nextInt(RANDOM_NUMBER_MAX + RANDOM_NUMBER_LOW);
        System.out.println("Welcome to the Game!!");
    // object instantiation of board & scoreboard   
        board = new Scoreboard();
        System.out.println("Enter Home Team Name");
        System.out.println("*********");
        System.out.println("Enter Away Team Name");
        System.out.println("*********");
        inputTeam();
        
    // score of the game is printed out    
        board.scoreHome = randNum;
        board.scoreAway = randNumNew;
        printScore(board);
        
          
            
     } // close main
     
     public static void printScore(Scoreboard sb ) {
         // random number to generate the inning number
         int RANDOM_NUMBER_MAX = 9;
           int RANDOM_NUMBER_LOW = 1; 
          Random randGenerator = new Random();
        int randNum = randGenerator.nextInt(RANDOM_NUMBER_MAX + RANDOM_NUMBER_LOW);
        // info about the game once again printed out 
         System.out.println("The game is in inning number " + randNum);
         System.out.println("The score is: " + "Home Team:" + sb.scoreHome + " " + "Away Team:" + sb.scoreAway );
         System.out.println("The winner is: " + sb.getWinner());
         System.out.println();
     } // close printScore
     
     public static void inputTeam() {
        // allows user to input team names of their choice
         Scanner scanner = new Scanner(System.in);
         String homeTeam = scanner.next();
         String awayTeam = scanner.next();
         board.homeTeamName = homeTeam;
         board.awayTeamName = awayTeam;        
         System.out.println("Who is the Home Team?" + " " + board.homeTeamName);
         System.out.println("Who is the Away Team?" +" " + board.awayTeamName);
     } // close inputTeam
   
} // close class
