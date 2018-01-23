/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Federico
 */
public class Draw {
    private static final int WIDTH = 30;
    private static final int HEIGHT = 50;
    
    public static void drawL(Graphics2D g, Point2D.Double p){
        double x=p.getX();
        double y=p.getY();
        Line2D.Double vert=  new Line2D.Double(x,y,x,y+HEIGHT);
        Line2D.Double oriz=  new Line2D.Double(x,y+HEIGHT,x+WIDTH,y+HEIGHT);
        g.draw(vert);
        g.draw(oriz);
        
    }
}
