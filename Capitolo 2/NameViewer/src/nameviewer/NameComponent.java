/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameviewer;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import javax.swing.JComponent;
/**
 *
 * @author Federico
 */
public class NameComponent extends JComponent {
    public void paintComponent (Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int width = 100;
        int height = 200;
        int x = 5;
        int y = 5;
        g2.setColor(Color.BLUE);
        g2.fillRect(x, y, width, height);
        g2.setColor(Color.RED);
        String name = "FEDERICO";
        Rectangle2D bound = g2.getFontMetrics().getStringBounds(name,g2);
        System.out.print(bound);
        x = (int) (x + width / 2 - bound.getCenterX());
        y = (int) (y + height / 2 - bound.getCenterY());
        g2.setColor(Color.red);
        g2.drawString(name, x, y);
    }
}
