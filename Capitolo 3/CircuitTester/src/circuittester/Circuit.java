/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuittester;

/**
 *
 * @author Federico
 */
public class Circuit {
    
    private int lamp;
    private int inter1;
    private int inter2;
    
    public Circuit (){
        lamp = 0;
        inter1 = 0;
        inter2=0;
    }
    
    public int getFirstSwitchState(){
        return inter1;
    }
    
    public int getSecondSwitchState(){
        return inter2;
    }
    
    public int getLampState (){
        return lamp;
    }
    
    private int change(int stato){
        if (stato == 0){
                return stato = 1;
        }
        else{
            return stato = 0;
        }
    }
    
    public void toggleFirstSwitch (){
        inter1 = change(inter1);
        lamp = change(lamp);
        
    }
    
    public void toggleSecondSwitch (){
        inter2 = change(inter2);
        lamp = change(lamp);
    }
}
