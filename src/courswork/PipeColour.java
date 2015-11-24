package courswork;
import java.awt.Color;

/**
 * ADPROC Coursework 2015.
 *
 * ORDER SYSTEM FOR A PIPE-SELLING COMPANY
 *
 * @authors 750430 & 750148
 */

public class PipeColour{

    private Color[] pipeColour;
    
    public PipeColour() {
        pipeColour = new Color[0];
    }
    
    public PipeColour(Color color) {
        pipeColour = new Color[]{color};
    }
 
    public PipeColour(Color c1, Color c2) {
        pipeColour = new Color[]{c1, c2};
    }
 
    public int getNumberOfColours() {
        return pipeColour.length;
    }
    
    public Color[] getColours() {
        return pipeColour;
    }
    
}