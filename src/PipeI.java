public class PipeI extends Pipee{

            
    public PipeI(boolean outerReinforcement, boolean innerInsulation, boolean chemicalResistance, int noColour, int plasticGrade, double length, double outerDiameter){
        
        super(outerReinforcement, innerInsulation, chemicalResistance, noColour, plasticGrade, length, outerDiameter); //for inheritance
        
        if (outerReinforcement) { //this is not okay
            throw new IllegalArgumentException("Must have no outer reinforcement.");
        }
        if (innerInsulation) {
            throw new IllegalArgumentException("Must have no insulation.");
        }
        if (0 > plasticGrade || plasticGrade > 3) {
            throw new IllegalArgumentException("Must have plastic grade between 1 and 3.");
        }
        if (noColour != 0) {
            throw new IllegalArgumentException("Can only have 0 colours.");
        }
    }
    // ADD THIS TO THE OTHER PIPE TYPES - with changes
    @Override //this is overidden in each of the sublclasses
    public double getPrice()
    {
        double area = calculateArea();
        double cost;
        
        if(plasticGrade == 1)
        {
            cost = area * 0.30;
        }
        else if(plasticGrade == 2)
        {
            cost = area * 0.32;
        }
        else
        {
            cost = area * 0.35;
        }
        
        if(chemicalResistance)
        {
            cost *= 1.12;
        }
        
        return cost;
    }
}