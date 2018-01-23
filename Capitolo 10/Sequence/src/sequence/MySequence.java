/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class MySequence implements Sequence {
    
    private int[] values ;
    private int i;
    private int n=0;
    public MySequence (){
        values = new int[10];
        i=0;
    }
    
    public void add(int num){
        values[i] = num ;
        i++;
    }
    
    @Override
    public boolean hasNext(){
        return n<values.length;
    }
    
    @Override
    public int next(){
        int app =  values[n];
        n++;
        return app;
    }
    
    public void reset(){
        n=0;
    }
    
    
}
