/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author michael.tomchak
 */
public class LoopingPractice1 {
    public static void main(String[] args) {
        int ctl = 2;
        int target = 4;
        boolean keepLooping = true;
        
        while(keepLooping) {
            System.out.println("ctl: " + ctl);
            System.out.println("target: " + target);
            System.out.println("keepLooping: " + keepLooping);
            if(ctl > target ) {
                keepLooping = false;
            }
            ctl++;        
        } // close while
    } // close main method
} // close class
