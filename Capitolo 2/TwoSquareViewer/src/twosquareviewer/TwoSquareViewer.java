/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosquareviewer;
import javax.swing.JFrame;
/**
 *
 * @author Federico
 */
public class TwoSquareViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle("Quadrati");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TwoSquareComponent component = new TwoSquareComponent();
        frame.add(component);
        frame.setVisible(true);
    }
    
}
