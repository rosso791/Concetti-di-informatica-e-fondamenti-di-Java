/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosquareviewer;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;
/**
 *
 * @author Federico
 */
public class TwoSquareComponent extends JComponent {
    public void paintComponent(Graphics g){
        int x = 75;
        int y = 100;
        int a = 100;
        int b = 20;
        Graphics2D g2 = (Graphics2D) g;
        Color viola = new Color (143,0,255);
        Rectangle quadrato = new Rectangle (x,y,a,a);
        Rectangle quad = new Rectangle (x+(a/2)-(b/2),y+(a/2)-(b/2),b,b);
        g2.draw(quadrato);
        g2.setColor (Color.PINK);
        g2.fill(quadrato);
        g2.draw(quad);
        g2.setColor(viola);
        g2.fill(quad);
        
        
       // g3.draw(quad);
    }
    
}
