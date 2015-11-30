
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author up750148
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test orderForm = new Test();
        orderForm.setLocationRelativeTo(null); //will load center of the screen
        orderForm.setResizable(false);//can't change the size of the window
        orderForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//'x' closes the whole application
        orderForm.setTitle("Order Form");
        orderForm.setVisible(true);
    }
    
}
