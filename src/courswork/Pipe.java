package courswork;

/**
 * ADPROC Coursework 2015.
 *
 * ORDER SYSTEM FOR A PIPE-SELLING COMPANY
 *
 * @authors 750430 & 750148
 */
public abstract class Pipe {

    protected static int[] pipeType; //array of int's
    protected static String pipeGrade;
    protected static boolean pipeColour1 = false;
    protected static boolean pipeColour2 = false;
    protected static boolean pipeInnerInsulation = false;
    protected static boolean pipeOuterReinforcement = false;
    protected static boolean pipeChemicalRestance = false;

    /**
     * multiple methods allowing for the creation of multiple objects. each
     * constructor (below) has an increasing quantity of arguments passed to it
     * so that we can not only allow for a better implemnentation of Abstraction
     * but we can create multiple similar objects and define specific things on
     * creation
     *
     *              ****!!!!CHECK THAT THIS IS CORRECT!!!!****
     */
    public Pipe() {
    }

    public Pipe(int[] pipeType) {
        this.pipeType = pipeType;
    }

    public Pipe(int[] pipeType, String pipeGrade) {
        this.pipeType = pipeType;
        this.pipeGrade = pipeGrade;
    }

    public Pipe(int[] pipeType, String pipeGrade, boolean pipeColour1,
            boolean pipeColour2, boolean pipeInnerInsulation,
            boolean pipeOuterReinforcement, boolean pipeChemicalRestance) {
        this.pipeType = pipeType;
        this.pipeGrade = pipeGrade;
        this.pipeColour1 = pipeColour1;
        this.pipeColour2 = pipeColour2;
        this.pipeInnerInsulation = pipeInnerInsulation;
        this.pipeOuterReinforcement = pipeOuterReinforcement;
        this.pipeChemicalRestance = pipeChemicalRestance;
    }

    /**
     * Now need to create some methods (not java language) of accessing this
     * data outside of this abstract class.
     */
    /**
     * @return the pipe type integer
     */
    protected int[] getPipeType() {
        return pipeType;
    }

    /**
     * @return the string value for the pipe grade
     */
    protected String getPipeGrade() {
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
     * Setter method
     * @param pipeType the type of the pipe entered by the user
     */
    protected void setPipeType(int newPipeType) {
        pipeType = new int[] {newPipeType};

    }
    

} // closes off the abstract class
