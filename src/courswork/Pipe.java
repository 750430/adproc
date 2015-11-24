package courswork;

import java.awt.Color;

/**
 * ADPROC Coursework 2015.
 *
 * ORDER SYSTEM FOR A PIPE-SELLING COMPANY
 *
 * @authors 750430 & 750148
 */

/**
 * as the abstract class PipeType is now available for use, this class is for
 * specifying what sort of pipes are available to the ordering system
 * 
 * BUILD MULTIPLE PIPEx AND EXTEND PIPETYPE.class
 * 
 * 
 */

public abstract class Pipe {

    //private PipeType pipeGrade; //pulls in the pipeGrade int array from PipeType class
    private double pipeLength; //new variable, int for pipeLength
    private double outerRadius;
    private int plasticGrade;
    private boolean isItInsulated;
    private boolean isItReinforced;
    private boolean checmicalResistant;
    private PipeColour pipeColour; //an object.
    private final PipeType pipeGrade;
    

    /**
     * method to initialise these new methods
     * @param pipeGrade
     * @param pipeLength 
     */
    public Pipe(PipeType pipeGrade, double pipeLength) {
        this.pipeGrade = pipeGrade;
        this.pipeLength = pipeLength;
    }
    
    /**
     * method to calculate pricing for pipe without additional requirements
     * @return prelimPrice preliminary pricing for pipe without extra features
     */
    protected double prelimPrice() {
       return 0;
    }
    
    /**
     * method to calculate the final cost of the pipe including the extra stuff
     * @return some text
     */
   protected double finalCost (){
        return 0;       
   }
   
   
   
}