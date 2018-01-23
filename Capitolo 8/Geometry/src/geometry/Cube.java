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
public class Cube {
    
    private double h;
    
    public Cube (double a){
        h=a;
    }
    
    public double cubeVolume(){
        return pow(h,3);
    }
    
    public double cubeSurface(){
        return pow(h,2);
    }
}
