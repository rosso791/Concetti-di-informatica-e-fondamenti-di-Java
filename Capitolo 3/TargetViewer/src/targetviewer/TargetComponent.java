/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetviewer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Federico
 */
public class TargetComponent extends JComponent {
    public void paintComponent (Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Target tar = new Target (80.0,80.0,20.0);
        tar.draw(g2);
    }
}
