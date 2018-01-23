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
public class Cone {
    
    private double h;
    private double r;
    
    public Cone (double a, double b){
        r=a;
        h=b;
    }
    
    public double coneVolume(){
        return (Math.PI*pow(r,2)*h)/3;
    }
    
    public double coneSurface(){
        double a= Math.sqrt(pow(r,2)+pow(h,2));
        double sl=Math.PI*r*a;
        return Math.PI*pow(r,2)+sl;   
    }
}
