/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import static java.lang.Math.pow;

/**
 *
 * @author Federico
 */
public class Geometry {

    
    public static double cubeVolume(double h){
        return pow(h,3);
    }
    
    public static double cubeSurface(double h){
        return pow(h,2);
    }
    
    public static double sphereVolume(double r){
        return (4/3)*Math.PI*pow(r,3);
    }
    
    public static double sphereSurface(double r){
        return 4*Math.PI*pow(r,2);
    }
    
    public static double cylinderVolume(double r, double h){
        return Math.PI*pow(r,2)*h;
    }
    
    public static double cylinderSurface(double r, double h){
        double slat= 2*Math.PI*r*h;
        return Math.PI*pow(r,2)+ slat;             
    }
    
    public static double coneVolume(double r, double h){
        return (Math.PI*pow(r,2)*h)/3;
    }
    
    public static double coneSurface(double r, double h){
        double a= Math.sqrt(pow(r,2)+pow(h,2));
        double sl=Math.PI*r*a;
        return Math.PI*pow(r,2)+sl;
        
    }
    
    public static double perimeter(Ellipse2D.Double e){
        double h = e.getHeight()/2;
        double w = e.getWidth()/2;
        double app = (Math.pow(h, 2)+Math.pow(w, 2))/2;
        return 2*Math.PI*Math.sqrt(app);
    }
    
    public static double area(Ellipse2D.Double e){
        return Math.PI*e.getHeight()/2*e.getWidth()/2;
    }
    
    public static double angle(Point2D.Double p, Point2D.Double q){
       return Math.atan2(q.getY()-p.getY(), q.getX()-p.getX());
    }

    
    public static double slope(Point2D.Double p, Point2D.Double q){
        return (q.getY() - p.getY()) / (q.getX() - p.getX());
    }
    
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e){
        return e.contains(p);
    }
    
}
