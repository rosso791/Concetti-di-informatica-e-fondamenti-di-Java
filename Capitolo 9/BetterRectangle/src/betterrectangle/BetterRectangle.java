/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterrectangle;

import java.awt.Rectangle;

/**
 *
 * @author Federico
 */
public class BetterRectangle extends Rectangle {
    
        
    public BetterRectangle (int x, int y, int width, int height ){
        super.setLocation(x,y);
        super.setSize(width, height);
    }
    
    public double getPerimeter(){
        return (width*2) + (height*2);
    }
    
    public double getArea(){
        return width*height;
    }
    
}
