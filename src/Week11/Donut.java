 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week11;

/**
 * "Blueprint" class that models
 * a real-world donut; No main method
 * @author michael.tomchak
 */
public class Donut {
    // Member variables
    // Each instance of a Donut class
    // will receive each of these member variables
    // and can customize their values
    String name;
    int percRemaining;
    String size;
    String flavor;
    
    /**
     * Simulates eating some percent of this donut
     * @param percentEaten 
     */
    
    public void eatDonut(int percentEaten) {
        percRemaining = percRemaining - percentEaten;
        
    }
    
    
    /**
     * Accessor method for retrieving the value
     * of the member variable: percRemaining:
     * @return 
     */
    public int getPercentRemaining() {
        return percRemaining;
    }
    
    
    
} // close class
