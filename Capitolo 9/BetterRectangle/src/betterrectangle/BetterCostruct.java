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
public class BetterCostruct  extends Rectangle{
    
    
    public BetterCostruct(int x,int y,int width, int height){
        super(x,y,width,height);
    }
    
    public int getPerimeter (){
        return (width*2)+(height*2);
    }
    
    public int getArea(){
        return width*height;
    }
}
