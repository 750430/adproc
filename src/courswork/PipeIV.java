public class PipeIV {
    
    public PipeIV(boolean outerReinforcement, boolean innerInsulation, int plasticGrade) {
        if (outerReinforcement) {
            throw new IllegalArgumentException("Must have no outer reinforcement.");
        }
        if (!innerInsulation) {
            throw new IllegalArgumentException("Must have insulation.");
        }
        if (1 < plasticGrade && plasticGrade < 6) {
            throw new IllegalArgumentException("Must have plastic grade between 2 and 5.");
        }
        
    }
    //////////////////////move this to pipe
    public static boolean pipeExists(boolean outerReinforcement, boolean innerInsulation, int plasticGrade) {
        try {
            new PipeIV(outerReinforcement, innerInsulation, plasticGrade);
        } catch (IllegalArgumentException e ) {
            return false;
        }
        return true;
    }
    
}