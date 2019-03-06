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
public class AuthenticationRevisted {

    private final static String CORRECT_PASSWORD = "12ab3";
    private final static String SECRET = "You did it!";
    private final static int NUM_ATTEMPTS = 3;

    public static void main(String[] args) {
        int attempts = 0;
        boolean password = true;
        System.out.println("**Authenticator Revisted**");

        String enterPasswd;

        Scanner userInputScanner = new Scanner(System.in);

        while (attempts < NUM_ATTEMPTS) {
            System.out.println("Enter password: ");
            enterPasswd = userInputScanner.next();
            attempts = attempts + 1;
            System.out.println("Attempts: " + attempts);
            System.out.println("Number of Attempts: " + NUM_ATTEMPTS);

            if (enterPasswd.equals(CORRECT_PASSWORD)) {
                System.out.println("Correct, the secret is... " + SECRET);
                break;
            } else {
                System.out.println("Failed!");
            } // close if/else 
            
        } // close while
    } // close main method
} // close class
