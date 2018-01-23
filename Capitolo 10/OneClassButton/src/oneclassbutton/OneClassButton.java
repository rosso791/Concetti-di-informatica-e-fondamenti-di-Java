/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneclassbutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Federico
 */
public class OneClassButton implements ActionListener{
    public static final int FRAME_WIDTH = 200;
    public static final int FRAME_HEIGHT = 100;
    public int count;
    private String label;
    
    public OneClassButton(String label){
        count = 0;
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        count++;
        System.out.println("Button " + this.label + " was clicked " + count + "times" );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("A");
        JButton but = new JButton("B");
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(but);
        frame.add(panel);
        
        
        ActionListener listener = new OneClassButton("A");
        ActionListener lis = new OneClassButton("B");
        button.addActionListener(listener);
        but.addActionListener(lis);
        
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
