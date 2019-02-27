/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

 import java.util.Scanner;
/**
 *
 * @author michael.tomchak
 */
public class MightWeBeFriends {
    public static void main(String[] args) {
        int response;
        int compScore = 0;
        Scanner keyScan = new Scanner(System.in);
        
        System.out.println("Do you like sports? (1 = yes, 2 = no) ");
        response = keyScan.nextInt();
        if(response == 1) {
            compScore = compScore + 5; 
            System.out.println("Great!");
            System.out.println("Baseball = 1 or Football = 2? ");
            
            response = keyScan.nextInt();
            if (response == 1) {
                compScore = compScore + 10;
            } else {
                compScore = compScore + 10;
                System.out.println("On the right path!");
            }
        } else {
            System.out.println("*sad face*");
            compScore = compScore - 5;
            
            System.out.println("Do you like pizza? (1 = yes, 2 = no)");
            response = keyScan.nextInt();
        
        } // end of if else blocks
    } // close main 
} // close class
