/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtester;

/**
 *
 * @author Federico
 */
public class Bug {
    private int position;
    private int direction; //1 right -1 left
    
    
    public Bug(int initialPosition){
        position = initialPosition;
        direction = 1;
    }
    
    public void turn (){
        direction = -(direction);
    }
    
    public void move (){
        position = position + direction;
    }
    
    public int getPosition (){
        return position;
    }
    
}
