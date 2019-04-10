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
public class Car {
    public int year;
    public String makeModel;
    
    // adding new Model Car info
    public String color;
    public boolean tintedWindows;
    public String manufacturer;
    public String bodyType;
   // close new Model Car info
    
    private boolean isEngineRunning;
    private double speed;
    
    public void startEngine() {
        isEngineRunning = true;
        System.out.println("...crank...vroom!");
    } // close method startEngine
    public void stopEngine() {
        isEngineRunning = false;
        System.out.println("...shldunk...");
    } // close method stopEngine
    public boolean checkEngineStatus() {
        return isEngineRunning;
    } // close method checkEngineStatus
    public double getCurrentSpeed() {
        return speed;
    } // close method getCurrentSpeed
    
    public double accelerate(int mphIncrease) {
        speed = speed + mphIncrease;
        return speed;
    } // close method accelerate
    public double decelerate(int mphDecrease) {
        speed = speed - mphDecrease;
        return speed;
    } // close method decelerate
} // close class
