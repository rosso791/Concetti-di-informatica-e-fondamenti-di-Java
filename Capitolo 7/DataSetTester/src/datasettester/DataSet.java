/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasettester;

/**
 *
 * @author Federico
 */
public class DataSet {
    private double array[];
    private int current; 
    public DataSet (int maximumNumberOfValues){
        array = new double [maximumNumberOfValues];
        current = 0;
    }
    
    public void add (double value){
        if (current < array.length){
           array[current] = value;
           current++;
        }
        else {
            System.out.println ("Array is full");
        }
    }
    
    public double sum (){
        double somma = 0;
        for (int i = 0; i<current; i++){
            somma +=array[i]; 
        }
        return somma;
    }
    
    public double media (){
        return  sum()/current;
    }
    
    public double maximum (){
        double max= array[0];
        for (int i = 1; i<array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    
    public double minimum(){
        double min = array[0];
        for (int i = 1; i<current; i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    
}
