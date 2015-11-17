package courswork;

/**
 * ADPROC Coursework 2015.
 *
 * ORDER SYSTEM FOR A PIPE-SELLING COMPANY
 *
 * @authors 750430 & 750148
 */
public abstract class PipeType {

    protected static int[] pipeGrade; //array of int's
    protected static boolean pipeColour1 = false;
    protected static boolean pipeColour2 = false;
    protected static boolean pipeInnerInsulation = false;
    protected static boolean pipeOuterReinforcement = false;
    protected static boolean pipeChemicalRestance = false;

    /**
     * multiple methods allowing for the creation of multiple objects. each
     * constructor (below) has an increasing quantity of arguments passed to it
     * so that we can not only allow for a better implementation of Abstraction
     * but we can create multiple similar objects and define specific things on
     * creation
     *
     *              ****!!!!CHECK THAT THIS IS CORRECT!!!!****
     */
    public PipeType() {
    }

    public PipeType(int[] pipeGrade) {
        PipeType.pipeGrade = pipeGrade;
    }

    public PipeType(int[] pipeGrade, boolean pipeColour1,
            boolean pipeColour2, boolean pipeInnerInsulation,
            boolean pipeOuterReinforcement, boolean pipeChemicalRestance) {
        PipeType.pipeGrade = pipeGrade;
        PipeType.pipeGrade = pipeGrade;
        PipeType.pipeColour1 = pipeColour1;
        PipeType.pipeColour2 = pipeColour2;
        PipeType.pipeInnerInsulation = pipeInnerInsulation;
        PipeType.pipeOuterReinforcement = pipeOuterReinforcement;
        PipeType.pipeChemicalRestance = pipeChemicalRestance;
    }

    /**
     * Now need to create some GET methods of accessing this
     * data outside of this abstract class.
     */
    /**
     * @return the pipe grade integer
     */
    protected int[] getPipeGrade() {
        return pipeGrade;
    }

    /**
     * @return the boolean value for 'one colour' pipe
     */
    protected boolean getPipeColour1() {
        return pipeColour1;
    }

    /**
     * @return the boolean value for 'two colours' pipe
     */
    protected boolean getPipeColour2() {
        return pipeColour2;
    }
    
    /**
     * @return the boolean value for pipe inner insulation
     */
    protected boolean getpipeInnerInsulation() {
        return pipeInnerInsulation;
    }
    /**
     * @return the value for pipe outer reinforcement
     */
    protected boolean getpipeOuterReinforcement() {
        return pipeOuterReinforcement;
    }
    /**
     * @return the value for pipe chemical restance
     */
    protected boolean getpipeChemicalRestance() {
        return pipeChemicalRestance;
    }
    /**
     * Now need to create some SET method of accessing this
     * data outside of this abstract class.
     * @param pipeType the type of the pipe entered by the user
     */
    
    protected void setPipeType(int newPipeGrade) {
        pipeGrade = new int[] {newPipeGrade};

    }
    
    /** a method to carry out some validation of pipeType int
     * @param inputFromUser is what the user of the GUI selects
     * @return true if it's correct and false if it isn't.
     */
    
    protected boolean isThePipeTypeRight(int inputFromUser)
    {
        for(int i=0; i<pipeGrade.length; i++)
        {
            if(pipeGrade[i] == inputFromUser)
            {
                return true;
            }
        }
    return false;
    }
    
    /**
     * another abstract method
     * @return more money to be added to the order
     */
    protected abstract float moreMoney();
    

} // closes off the abstract class
