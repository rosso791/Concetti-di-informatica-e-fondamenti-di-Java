/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import static java.lang.Math.pow;

/**
 *
 * @author Federico
 */
public class Cylinder {
    
    private double h;
    private double r;
    
    public Cylinder (double a, double b){
        r= a;
        h=b;
    }
    
    public double cylinderVolume(){
        return Math.PI*pow(r,2)*h;
    }
    
    public double cylinderSurface(){
        double slat= 2*Math.PI*r*h;
        return Math.PI*pow(r,2)+ slat;             
    }
}
