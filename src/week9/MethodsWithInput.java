/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author michael.tomchak
 */
public class MethodsWithInput {
    public static void main(String[] args) {
        addNumbers(2,3);
    } // close main
    /**
     * Adds the input parameters and prints results
     * @param a
     * @param b 
     */
    public static void addNumbers(int a, int b) {
        int result = a + b;
        System.out.println("Result: " + result);
    } // close methods addNumbers
} // close class
