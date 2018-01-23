/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labeledpoint;

import java.awt.Point;

/**
 *
 * @author Federico
 */
public class LabelPointNew {
    private Point p;
    private String label;
    
    public LabelPointNew (int x, int y, String label){
        p = new Point (x,y);
        this.label = label;
    }
    
    public String toString(){
        return this.p.toString() + " label: " + this.label;
    }
    
}
