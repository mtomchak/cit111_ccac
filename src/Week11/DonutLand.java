/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week11;

/**
 * Client class of our Donut class
 * We make instances of Donut objects
 * and populate their member variables
 * @author michael.tomchak
 */
public class DonutLand {
    public static void main(String[] args) {
        // make (i.e. "instantiate") a Donut
        // and store a reference to that object
        // in variable called firstDonut
        // of type Donut
        Donut firstDonut = new Donut();
        firstDonut.flavor = "Powdered";
        firstDonut.name = "Jim";
        firstDonut.size = "Ball";
        firstDonut.percRemaining = 100;
        firstDonut.eatDonut(100);
        printDonutStats(firstDonut);
        
        // instantiate your second Donut
        // populate its member variables
        // with proper values
        
        Donut secondDonut = new Donut();
        secondDonut.flavor = "Chocolate";
        secondDonut.name = "Tim";
        secondDonut.size = "Circle";
        secondDonut.percRemaining = 100;
        secondDonut.eatDonut(20);
        printDonutStats(secondDonut);
        
        
        
    } // close main
    
    public static void printDonutStats(Donut d) {
        System.out.println("Perc remaining of " + d.name + " is " + d.getPercentRemaining() + "%");
        
    } // close printDonutStats
    
    
} // close class
