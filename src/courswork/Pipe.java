package courswork;

/**
 * ADPROC Coursework 2015.
 *
 * ORDER SYSTEM FOR A PIPE-SELLING COMPANY
 *
 * @authors 750430 & 750148
 */

/**
 * as the abstract classes are now available for use, this class is for
 * specifying what sort of pipes are available to the system
 */

public class Pipe {

    protected PipeType pipeGrade;
    protected int pipeLength;

    public Pipe() {
    }
    /**
     * 
     * @param pipeGrade
     * @param pipeLength 
     */
    public Pipe(PipeType pipeGrade, int pipeLength) {
        this.pipeGrade = pipeGrade;
        this.pipeLength = pipeLength;
    }
    

}
