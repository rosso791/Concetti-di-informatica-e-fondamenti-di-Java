/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import java.lang.Math;
/**
 *
 * @author Federico
 */
public class Counter {
    private int value;
    private int limit;
    
    public Counter(){
        value = 0;
    }
    
    public int getValue(){
        return value;
    }
    
    public void click(){
        value = value +1;
        value = Math.min(limit, value);
    }
    
    public void reset(){
        value = 0;
    }
    
    public void undo(){
        value = value-1;
        value = Math.max(value,0);
    }
    
    public void setLimit(int maxmin){
        limit = maxmin;
    }
    
    
    
    
}
