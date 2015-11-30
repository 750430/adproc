public class PipeIV extends Pipee{

            
    public PipeIV(boolean outerReinforcement, boolean innerInsulation, boolean chemicalResistance, int noColour, int plasticGrade, double length, double outerDiameter){
        
        super(outerReinforcement, innerInsulation, chemicalResistance, noColour, plasticGrade, length, outerDiameter); //for inheritance
        
        if (outerReinforcement) { //this is not okay
            throw new IllegalArgumentException("Must have no outer reinforcement.");
        }
        if (!innerInsulation) {
            throw new IllegalArgumentException("Must have insulation.");
        }
        if (1 > plasticGrade || plasticGrade > 6) {
            throw new IllegalArgumentException("Must have plastic grade between 2 and 5.");
        }
        if (noColour != 2) {
            throw new IllegalArgumentException("Can only have 2 colours.");
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
        
        else if(plasticGrade == 5)
        {
            cost = area * 0.46;
        }
        if(chemicalResistance)
        {
            cost *= 1.12;
        }
        
        //2 colour
        cost *= 1.17;
        
        return cost;
        
    }
}