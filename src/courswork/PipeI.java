public class PipeI {
    
    public PipeI(boolean outerReinforcement, boolean innerInsulation, int plasticGrade) {
        if (outerReinforcement) {
            throw new IllegalArgumentException("Must have no outer reinforcement.");
        }
        if (innerInsulation) {
            throw new IllegalArgumentException("Must have insulation.");
        }
        if (0 < plasticGrade && plasticGrade < 3) {
            throw new IllegalArgumentException("Must have plastic grade between 2 and 5.");
        }
        if (!noColour == 0) {
            throw new IllegalArgumentException("Can only have 0 or 1 colour.");
        }
    }