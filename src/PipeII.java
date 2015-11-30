public class PipeII extends Pipee{

            
    public PipeII(boolean outerReinforcement, boolean innerInsulation, boolean chemicalResistance, int noColour, int plasticGrade, double length, double outerDiameter){
        
        super(outerReinforcement, innerInsulation, chemicalResistance, noColour, plasticGrade, length, outerDiameter); //for inheritance
        
        if (outerReinforcement) { //this is not okay
            throw new IllegalArgumentException("Must have no outer reinforcement.");
        }
        if (innerInsulation) {
            throw new IllegalArgumentException("Must have no insulation.");
        }
        if (1 > plasticGrade || plasticGrade > 5) {
            throw new IllegalArgumentException("Must have plastic grade between 2 and 4.");
        }
        if (noColour != 1) {
            throw new IllegalArgumentException("Can only have 1 colour.");
        }
    }
    // ADD THIS TO THE OTHER PIPE TYPES - with changes
    @Override //this is overidden in each of the sublclasses
    public double getPrice()
    {
        double area = calculateArea();
        double cost = 0;
        
        if(plasticGrade == 2)
        {
            cost = area * 0.32;
        }
        else if(plasticGrade == 3)
        {
            cost = area * 0.35;
        }
        else if(plasticGrade == 4)
        {
            cost = area * 0.40;
        }
        
        if(chemicalResistance)
        {
            cost *= 1.12;
        }
        
        //1 colour
        cost *= 1.12;
        
        return cost;
        
    }
}