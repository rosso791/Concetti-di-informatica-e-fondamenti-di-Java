/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bignamewindow;

/**
 *
 * @author Federico
 */
import java.awt.Dimension;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class BigNameWindow {

    public static void main(String[] args) {
        JFrame window = new JFrame("My Big Name Window");
        window.setSize(new Dimension(640,480));
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        BigNameComponent nameComponent = new BigNameComponent("Giggi");
        window.add(nameComponent);
        window.setVisible(true);
    }
    
}
