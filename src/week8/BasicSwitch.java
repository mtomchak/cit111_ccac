/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author michael.tomchak
 */
public class BasicSwitch {
    public static void main(String[] args) {
        final int SELECTOR = 1;
        
        switch(SELECTOR) {
            case 1:
                System.out.println("First case selected");
                break;
            case 2:
                System.out.println("Second case selected");
                break;
            case 78:
                System.out.println("Cases can match any int value");
                break;
                // any pass through this switch which doesn't match a case hits here
            default:
                System.out.println("Default case");
        } // close switching block
    } // close main
} // close class
