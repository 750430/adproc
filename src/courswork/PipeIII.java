public class PipeIII {
    
    public PipeIII(boolean outerReinforcement, boolean innerInsulation, int plasticGrade) {
        if (outerReinforcement) {
            throw new IllegalArgumentException("Must have no outer reinforcement.");
        }
        if (innerInsulation) {
            throw new IllegalArgumentException("Must have insulation.");
        }
        if (1 < plasticGrade && plasticGrade < 6) {
            throw new IllegalArgumentException("Must have plastic grade between 2 and 5.");
        }
        
    }
}