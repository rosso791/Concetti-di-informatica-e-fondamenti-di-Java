/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istogramviewer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 *
 * @author Federico
 */
public class InstogramComponent extends JComponent {
    public void paintComponent (Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x = getWidth() ;
        int y = getHeight() ;
        Line2D.Double drawX = new Line2D.Double(x-10,y-20,5,y-20 );
        Line2D.Double drawY = new Line2D.Double(10,10,10,y-10);
        g2.setColor(Color.BLUE);
        g2.draw(drawX);
        g2.draw(drawY);
        g2.setColor(Color.BLACK);
        Istogram ist = new Istogram ("macchine",150,10,y-170);
        ist.draw(g2);
        Istogram ist2 = new Istogram ("moto",250,25,y-270);
        ist2.draw(g2);
       
        
    }
}
