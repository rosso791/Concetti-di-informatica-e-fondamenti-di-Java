/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonwithdate;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Federico
 */
public class ButtonWithDate {

   public static final int FRAME_WIDTH = 200;
    public static final int FRAME_HEIGHT = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Button1 Click me");
        frame.add(button);
        
        
        ActionListener listener = new ClickListner();
        ActionListener lis = new ClickListner();
        button.addActionListener(listener);
        
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
             
    }
}
