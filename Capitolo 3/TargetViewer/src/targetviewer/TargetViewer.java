/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetviewer;

import javax.swing.JFrame;

/**
 *
 * @author Federico
 */
public class TargetViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setSize(300,400);
        j.setTitle("Target");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent target = new TargetComponent();
        j.add(target);
        j.setVisible(true);
    }
    
}
