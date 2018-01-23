/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencetest;

import static java.lang.Math.max;
import java.util.Arrays;

/**
 *
 * @author Federico
 */
public class Sequence {
    private int[]values;
    public Sequence(int size){
        values = new int [size];
    }
    
    public void set(int i, int n){
        values[i] = n;
    }
    
    public int get (int i){
        return values[i];
    }
    
    public int size(){
        return values.length;
    }
    
    public boolean equals (Sequence other){
        if (values.length != other.size() ){
            return false;
        }
        else{
            boolean find = true;
            for (int i = 0; i<values.length && find== true; i++){
                    if (values[i] != other.get(i)){
                        find = false;
                    }
            }
            return find;
        }
    }
    
    public boolean contiene (int val){
        for (int i = 0; i < values.length; i++){
            System.out.println(val + "  " + values[i]);
            if (values[i] == val){
                System.out.println();
                return true;
            }
        }
        return false;
    }
    
    public void sort(){
        Arrays.sort(values);
    }
    
    public Sequence copyof(){
        Sequence copy = new Sequence (values.length);
        for (int i = 0;i <values.length; i++){
            copy.set(i, values[i]);
        }
        return copy;
    }
    
   
    // da fare;
    public boolean sameValues(Sequence other){
        return true;
    }
    


    public boolean isPermutation (Sequence other){
        if (values.length != other.size()){
            return false;
        }
        else{
           Sequence app = new Sequence (other.size());
           app = other.copyof();
           app.sort();
           int[] appVal = new int [values.length];
           appVal = Arrays.copyOf(values, values.length);
           Arrays.sort(appVal);
           for (int i = 0; i<app.size(); i++){
               if (appVal[i] != app.get(i)){
                   return false;
               }
           }
        }
        return true;
    }
    
    
    public void print(){
        for (int i = 0; i<values.length; i++){
            System.out.print(values[i] + "  ");
        }
    }
    
    public void initialize (){
        for (int i = 0 ; i < values.length; i++){
            values[i]  = 0;
        }
    }
    
    public Sequence sum(Sequence other){
        int lengthNew = max (other.size(), values.length);
        Sequence sum = new Sequence (lengthNew);
        sum.initialize();
        for (int i = 0; i<values.length; i++){
            sum.set(i,values[i]);
        }
        for (int i = 0; i<other.size(); i++){
            sum.set(i,other.get(i)+sum.get(i));
        }
        return sum;
    }
    
}
