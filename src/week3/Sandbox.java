/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author michael.tomchak
 */
public class Sandbox {
    public static void main(String[] args) {
        int response_vidgames;
        int compScore = 0;
        Scanner keyScan = new Scanner(System.in);
        
        // ask the user for an integer, store it in variable age
        System.out.println("Do you play video games (1 = yes, 2= no)");
        response_vidgames = keyScan.nextInt();
        if(response_vidgames == 1){    
            compScore = compScore + 10;
        }
        System.out.println("You entered age of: " + response_vidgames);
        response_vidgames = keyScan.nextInt();
        System.out.println("You entered age of: " + response_vidgames);
        
    }
}
