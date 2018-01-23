/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istogramviewer;

import javax.swing.JFrame;

/**
 *
 * @author Federico
 */
public class IstogramViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setSize(300,400);
        j.setTitle("Target");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InstogramComponent ist = new InstogramComponent();
        j.add(ist);
        j.setVisible(true);
    }
    
}
