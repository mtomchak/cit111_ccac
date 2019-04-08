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
 * Tracks valid heights to ride theme and thrill rides
 * Totals number of failed riders, total riders, and sick riders as well
 */
public class KennywoodRideTracker {

    private static int totalRiders = 0;
    private static int totalFailed = 0;
    private static int totalSick = 0;
    final static int THRILLRIDE = 60;
    final static int THEMERIDE = 48;

    public static void main(String[] args) {
        System.out.println("Begin ride simulation");
        printRiderStats();
        
        rideBlackWidow(15,62);
        printRiderStats();
        
        rideMerryGoRound(25,49);
        printRiderStats();
        
        rideBlackWidow(10, 50);
        printRiderStats();
        
        
        
    } // close main

    public static void rideBlackWidow(int riders, int avgHeight) {
        if (avgHeight >= THRILLRIDE) {
            System.out.println("Riding Black Widow..");
            System.out.println("I really hate spiders!!");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSick = totalSick + numSickRiders;
        } else {
            System.out.println(riders + " riders who were too short; no ride for them");
            totalFailed = totalFailed + riders;
        } // close else

    } // close method rideBlackWidow

    public static void rideMerryGoRound(int riders, int avgHeight) {
        if (avgHeight >= THEMERIDE ) {
            System.out.println("Riding Merry-Go-Round");
            System.out.println("It goes round and round and round");
            totalRiders = totalRiders + riders;
            Random rand = new Random ();
            int numSickRiders = rand.nextInt(riders);
            totalSick = totalSick + numSickRiders;
        } else {
            System.out.println(riders + " riders who were too short; no ride for them");
            totalFailed = totalFailed + riders;
        } // close else

    } // close method rideMerryGoRound

    public static void printRiderStats() {
        System.out.println("*****Rider Stats*****");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailed);
        System.out.println("Total Sick Riders: " + totalSick);
        System.out.println("**********");
        
    } // close method printRiderStats

} // close class
