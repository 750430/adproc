public class PipeII {
    
    public PipeII(boolean outerReinforcement, boolean innerInsulation, int plasticGrade) {
        if (outerReinforcement) {
            throw new IllegalArgumentException("Must have no outer reinforcement.");
        }
        if (innerInsulation) {
            throw new IllegalArgumentException("Must have insulation.");
        }
        if (1 < plasticGrade && plasticGrade < 5) {
            throw new IllegalArgumentException("Must have plastic grade between 2 and 5.");
        }
        if (!noColour == 0 || !noColour == 1) {
            throw new IllegalArgumentException("Can only have 0 or 1 colour.");
        }
    }