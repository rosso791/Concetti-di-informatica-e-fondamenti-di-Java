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
public class PerimeterMeasurer implements Measurer {
    
    public double measure(Object anObject){
        Rectangle app = (Rectangle) anObject;
        return app.getHeight()*2 + app.getWidth()*2;
    }
}
