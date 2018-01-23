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
public class Sphere {
    
    private double r;
    
    public Sphere (double a){
        r=a;
    }
    
    public double sphereVolume(){
        return (4/3)*Math.PI*pow(r,3);
    }
    
    public double sphereSurface(){
        return 4*Math.PI*pow(r,2);
    }
}
