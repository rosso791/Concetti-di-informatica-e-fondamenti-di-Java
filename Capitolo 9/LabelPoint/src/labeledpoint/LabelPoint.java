/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labeledpoint;

/**
 *
 * @author Federico
 */
public class LabelPoint {
    
    private int x;
    private int y;
    private String label;
    
    public LabelPoint(int x,int y,String label){
        this.x=x;
        this.y=y;
        this.label = label;
    }
    
    public String toString(){
        return getClass().getName() + " name:" + this.label + " x= " + this.x + " y= " + this.y;
    }
    
}
