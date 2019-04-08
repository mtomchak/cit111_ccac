/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.Scanner;

/**
 *
 * @author michael.tomchak
 */
public class PurchaseCalculator {
    public static void main(String[] args) {
        final double ITEM_PRICE = 100.00;
        double discount = 0.15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        
        displayPriceWithTax(ITEM_PRICE);
        computePriceAfterDiscount(ITEM_PRICE, discount);
        displayPurchaseNumber(ITEM_PRICE, 200.0);
    } // close main method
    public static void displayPriceWithTax(double price) {
        final double TAX_RATE = 0.075;
        // compute price + tax
        double totalPrice = price * (1+ TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    } // close method displayPriceWithTax
    public static void computePriceAfterDiscount(double price, double discount) {
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
    } // close method computePriceAfterDiscount
    /**
     * 
     * @param price
     * @param limit 
     */
    public static void displayPurchaseNumber(double price, double limit) {
       int numPurchase = (int) Math.floor(limit / price);
       System.out.println("With $" + limit
                + ", you can buy " + numPurchase + " units");
                
       
    } // close displayPurchaseNumber
} // close class 
