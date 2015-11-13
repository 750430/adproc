package courswork;

import static courswork.PipeType.pipeGrade;

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
 */

public class Pipe {

    protected PipeType pipeGrade; //pulls in the pipeGrade int array from PipeType class
    protected int pipeLength; //new method, int for pipeLength

    public Pipe() {
    }
    /**
     * method to initialise these new methods
     * @param pipeGrade
     * @param pipeLength 
     */
    public Pipe(PipeType pipeGrade, int pipeLength) {
        this.pipeGrade = pipeGrade;
        this.pipeLength = pipeLength;
    }
    
    /**
     * method to calculate pricing for pipe without additional requirements
     * @return prelimPrice preliminary pricing for pipe without extra features
     */
    protected double prelimPrice() {
    }
    
    /**
     * method to calculate the final cost of the pipe including the extra stuff
     * @return some text
     */
    protected double finalCost() {
    }
