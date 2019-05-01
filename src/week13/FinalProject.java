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
     
    
     public static void main(String[] args) {
        System.out.println("Welcome to the Game!!");
       
        board = new Scoreboard();
        System.out.println("Enter Home Team Name");
        System.out.println("*********");
        System.out.println("Enter Away Team Name");
        System.out.println("*********");
        inputTeam();
        
        
        board.scoreHome = 3;
        board.scoreAway = 2;
        printScore(board);
        
          
            
     } // close mainPir
     
     public static void printScore(Scoreboard sb ) {
           int RANDOM_NUMBER_MAX = 9;
           int RANDOM_NUMBER_LOW = 1; 
          Random randGenerator = new Random();
        int randNum = randGenerator.nextInt(RANDOM_NUMBER_MAX + RANDOM_NUMBER_LOW);
         
         System.out.println("The game is in inning number " + randNum);
         System.out.println("The score is: " + "Home Team:" + sb.scoreHome + " " + "Away Team:" + sb.scoreAway );
         System.out.println("The winner is: " + sb.getWinner());
         System.out.println();
     } // close printScore
     
     public static void inputTeam() {
         Scanner scanner = new Scanner(System.in);
         String homeTeam = scanner.next();
         String awayTeam = scanner.next();
         board.homeTeamName = homeTeam;
         board.awayTeamName = awayTeam;        
         System.out.println("Who is the Home Team?" + " " + board.homeTeamName);
         System.out.println("Who is the Away Team?" +" " + board.awayTeamName);
     } // close inputTeam
   
} // close class
