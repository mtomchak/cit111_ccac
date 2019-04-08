/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Random;
/**
 *
 * @author michael.tomchak
 */
public class TheRing {
      // chop main up and call the new methods as needed
    public static void main(String[] args) {
        
        
        String viewer1 = "Katie";
        String viewer2 = "Josh";
        String viewer3 = "Rachel";
        String viewer4 = "Noah";
        String viewer5 = "Aiden";
        
        System.out.println("****************************************");
        
        WatchFilm(viewer1);
        WatchFilm(viewer2);
        WatchFilm(viewer3);
        WatchFilm(viewer4);
        WatchFilm(viewer5);
       
    } // close main
    
    // write and test your new methods here
    public static void WatchFilm(String viewer) {
         Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();
        System.out.println(viewer + " watched the tape; 7 days to live");
        
        System.out.print("Did Viewer named " + viewer + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer + " is toast");
           
        }
        
    } // close method WatchFilm
} // close class
