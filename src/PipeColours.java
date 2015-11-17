package courswork;

/**
 * ADPROC Coursework 2015.
 *
 * ORDER SYSTEM FOR A PIPE-SELLING COMPANY
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
    
    public PipeColours(int colourForPipe, int[] pipeGrade) {
        super(int colourForPipe, int[] pipeGrade); //TODO: WTF. IT MAKES *SOME* SENSE IN MY HEAD.
    }

    @Override
    protected float moreMoney() {
        return PipesRusGUI.someMethodYetToBeBuilt;
    }
    
}