/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brighterdemo;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author Federico
 */
public class BrighterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        Color col = new Color(50,100,150);
        Color result = col.brighter();
        frame.getContentPane().setBackground(col);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JFrame win = new JFrame();
        win.setSize(200,200);
        win.getContentPane().setBackground(result);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
    
}
