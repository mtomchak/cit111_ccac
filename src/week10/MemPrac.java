/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author michael.tomchak
 */
public class MemPrac {
     public static int gallons = 0;
     public static int peanuts = 0;
     
     public static void main(String[] args) {
         printMemVars();
         purchaseGas(3);
         peanuts = 6;
         int r = useGas(8);
         System.out.println("r: " + r);
         printMemVars();
         purchaseGas(22);
         r = useGas(1);
         System.out.println("r: " + r);
         printMemVars();
     } // close main
     
     public static void purchaseGas(int g) {
         gallons = gallons + g;
     } // close method purchaseGas
     
     public static int useGas(int u) {
         gallons = gallons - u;
         peanuts = 3;
         return gallons;   
     } // close method useGas
     
     public static void printMemVars() {
         System.out.println("*********");
         System.out.println("Gallons: " + gallons);
         System.out.println("Peanuts: " + peanuts );
         System.out.println("*********");
     } // close method printMemVars
     
} // close class
