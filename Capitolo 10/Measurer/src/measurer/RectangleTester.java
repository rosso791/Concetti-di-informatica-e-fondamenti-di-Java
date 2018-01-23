/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package measurer;

import java.awt.Rectangle;

/**
 *
 * @author Federico
 */
public class RectangleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Measurer per = new PerimeterMeasurer();
        
        Rectangle[] rects = new Rectangle[] {new Rectangle(5,10,20,30), 
            new Rectangle (10,20,30,40), 
            new Rectangle(20,30,5,15)};
        Object res = Data.max(rects, per);
        Rectangle app = (Rectangle) res;
        System.out.println(app.toString());
    }
    
}
