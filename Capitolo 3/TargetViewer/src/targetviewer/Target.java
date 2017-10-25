/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetviewer;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 *
 * @author Federico
 */
public class Target {
    private double x;
    private double y;
    private double radius;
    private int offset = 10;
    public Target(double centerX, double centerY, double r){
       x = centerX;
       y = centerY;
       radius = r;
    }
    
    public  double getX (){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void draw (Graphics2D g2){
        Ellipse2D circle = new Ellipse2D.Double (x,y,radius,radius);
        Ellipse2D circle2 = new Ellipse2D.Double(x-10,y-10 ,radius*2,radius*2);
        Ellipse2D circle3 = new Ellipse2D.Double(x-20,y-20,radius*3, radius*3);
        System.out.print(circle.getX());
        System.out.print(circle2.getX());
        System.out.print(circle3.getX());
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke (10.0f));
        g2.draw(circle);
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke (10.0f));
        g2.draw(circle2);
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke (10.0f));
        g2.draw(circle3);
        /*for (int i = 1; i<= 8;i++)
        g2.draw(new Ellipse2D.Double(x - i*10,y - i*10,i*radius, i*radius));*/
      
        
    }
    
   
    
    
}
