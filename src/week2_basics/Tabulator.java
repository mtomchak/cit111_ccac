/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_basics;
import java.util.Scanner;
/**
 *
 * @author michael.tomchak
 */
public class Tabulator {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        
        int totalRespondents = 0;
        int numLinuxUsers = 0;
        
        System.out.println("LINUX USERS SURVEY");
          
            System.out.println(">>>>>>>>>>QUESTION<<<<<<<<<<<<");
            System.out.println("Do you regulary use Linux Software? (Android == Linux!!)");
            System.out.println("(Enter 1 for YES and 0 for NO)");
            
            int userResponse = scanner.nextInt();
                if (userResponse == 1) {
                numLinuxUsers = numLinuxUsers + 1;
                System.out.println("Yeaaah! Free Software Users Unit!");
              } else{
            System.out.println("[sad face] Visit ubuntu.com immediately!"); 
           
          totalRespondents = totalRespondents + 1;
            
          System.out.println("*****SUMMARY*****");
          System.out.println(totalRespondents + " folks have responded.");
          System.out.println(numLinuxUsers + " report(s) regulary using Linux.");
          double linuxDouble = (double) numLinuxUsers;
          double totalDouble = (double) totalRespondents;
          double percentUsers = (linuxDouble/totalDouble) * 100;
          System.out.println("This translates into a use percentage of: " +percentUsers + "%");
           
        }       
    }
}

    
