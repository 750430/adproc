/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author up750148
 */
public abstract class Pipee { //only using this class to create subclasses
    
    protected boolean outerReinforcement, innerInsulation, chemicalResistance;
    protected int noColour, plasticGrade;
    protected double length, outerDiameter;
    
    public Pipee (boolean outerReinforcement, boolean innerInsulation, boolean chemicalResistance, int noColour, int plasticGrade, double length, double outerDiameter)
    {
        this.length = length;
        this.outerDiameter = outerDiameter;
        this.noColour = noColour;
        this.plasticGrade = plasticGrade;
        this.outerReinforcement = outerReinforcement;
        this.innerInsulation = innerInsulation;
        this.chemicalResistance = chemicalResistance;
    }
    
    //to be overidden in subclasses
    public abstract double getPrice();
    
    public String printCost()
    {
        return "";
    }
    
    public double calculateArea()
    {
        double outerRadius = outerDiameter / 2;
        double innerRadius = outerRadius * 0.9;
        
        double len = length * 39.37;

        double cylinder1 = (Math.PI * (outerRadius*outerRadius) * len);
        double cylinder2 = (Math.PI * (innerRadius*innerRadius) * len);
        
        double plasticArea = cylinder1 - cylinder2;
        
        return plasticArea;
        /** EXPLANATION OF HOW THIS WORKS:
         * 1 inch thick and 1 meter long:
         * 0.25pi - 0.2025pi
         * = 0.0475pi inches squared
         * = 39.37 inches * 0.0475pi inches squared
         * = 39.37 x 0.0475pi
         * = 5.8701388166 inches squared * 0.3
         * = 1.7625041645
        */
    }
    
    //mutators
    public int getColour() { return noColour; }
    public int getGrade() { return plasticGrade; }
    public double getLength() { return length; }
    public double getDiameter() { return outerDiameter; }
    public boolean getChemical() { return chemicalResistance; }
    public boolean getInner() { return innerInsulation; }
    public boolean getOuter() { return outerReinforcement; }
    
}
