/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istogramviewer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

/**
 *
 * @author Federico
 */
public class Istogram {
    private String etichetta;
    private int valore;
    private int asseX;
    private int asseY;
    
    public Istogram (String  eti, int val, int x, int y){
        etichetta = eti + " " + val;
        valore = val;
        asseX = x;
        asseY = y;
    }
    
    public static void drawRotate(Graphics2D g2d, double x, double y, int angle, String text) {    
        g2d.translate((float)x,(float)y);
        g2d.rotate(Math.toRadians(angle));
        g2d.drawString(text,0,0);
        g2d.rotate(-Math.toRadians(angle));
        g2d.translate(-(float)x,-(float)y);
    }    
    
    public void draw (Graphics2D g2){
        
        Rectangle rect = new Rectangle (asseX,asseY,10,valore);
        g2.setColor(Color.BLACK);
        g2.draw(rect);
        drawRotate(g2,asseX,asseY,90,etichetta);
        
    }
}
