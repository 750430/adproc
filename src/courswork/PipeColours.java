package courswork;

/**
 * ADPROC Coursework 2015.
 *
 * ORDER SYSTEM FOR A PIPE-SELLING COMPANY
 *
 * @authors 750430 & 750148
 */

/**
 * 
 * @authors 750430 & 750148
 */

public class PipeColours extends PipeType{

    /**
     * creates a superclass, good ol' inheritance
     */
    public PipeColours()
    {
        super();
    }
    
    public PipeColours(int[] pipeGrade, int colourForPipe) {
        super(colourForPipe, pipeGrade); //TODO: WTF. IT MAKES SOME SENSE IN MY HEAD.
    }

    @Override //automatically generated from netbeans alt + enter ;0 TODO: NEEDS CONFIRMING
    protected float moreMoney() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}