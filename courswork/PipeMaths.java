/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courswork;

/**
 *
 * @author J_T
 */
public class PipeMaths {
    
    private double meter2inch(int meter) {
        double inch = 39.37 * meter;
        return inch;
    }
    
    private int inch2meter(double inch) {
        int meter = (inch / 39.37);
        
        return meter;
    }
    
    
}
