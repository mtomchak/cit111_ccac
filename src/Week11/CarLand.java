/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week11;

/**
 *
 * @author michael.tomchak
 */
public class CarLand {
    public static void main(String[] args) {
        Car deLorean = new Car();
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        displayCarStats(deLorean);
        // new Model Car info added
         Car camaro = new Car();
        camaro.makeModel = "Chevy Camaro SS";
        camaro.color = "black";
        camaro.manufacturer = "chevy";
        camaro.bodyType = "rectangular";
        camaro.tintedWindows = true;
        camaro.year = 2016;
        // close new Model Car info
        displayCarStats(camaro);
        
        deLorean.startEngine();
        deLorean.accelerate(88);
        deLorean.decelerate(12);
        
        displayCarStats(camaro);
        deLorean.stopEngine();
        displayCarStats(camaro);
    } // close main method
    public static void displayCarStats(Car anyCarObject) {
        System.out.println("****STATS****");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
        System.out.println("**********");
    } // close method displayCarStats
    
    
} // close class
