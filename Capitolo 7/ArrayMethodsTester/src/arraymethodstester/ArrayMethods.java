/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymethodstester;

/**
 *
 * @author Federico
 */
public class ArrayMethods {
    private int values[];
    public ArrayMethods(int[] initialValues){
        values = initialValues;
    }
    
    public void swapFirstLast(){
        int tmp = values[0];
        values[0] = values[values.length-1];
        values[values.length-1]= tmp;
    }
    
    public void shiftRight(){
        int tmp =values[0];
        for (int i = 0; i<values.length-1; i++){
            tmp = values[i+1];
            values[i+1] = values[i];
        }
        values[0] = tmp;
    }
    
    public void pairToZero (){
        for (int i = 0; i< values.length; i++){
            if (values[i] %2 == 0){
                values[i] = 0;
            }
        }
    }
    
    public void substitute(){
        for (int i = 1; i< values.length -1; i++){
            if (values[i+1]> values[i-1]){
                values[i] = values[i+1];
            }
            else{
                values[i] = values[i-1];
            }
        }
    }
    
    public void eliminate (){
        if (values[(values.length/2)] %2 != 0){
           int [] tmp = new int [values.length-1];
           int pos = 0;
           for (int i = 0; i<values.length; i++){
               if ( i != values.length/2){
                   tmp[pos] = values[i];
                   pos++;
               }
           }
           values = tmp;
        }
        else{
           int [] tmp = new int [values.length -2];
           int pos = 0;
           for (int i = 0; i<values.length; i++){
               if ( i != values.length/2 || i != values.length/2+1  ){
                   tmp[pos] = values[i];
                   pos++;
               }
           }
           values = tmp;
        }
    }
    
    public void firstPair (){
        int [] tmp = new int[values.length];
        int pos = 0;
        for(int i = 0; i<values.length;i++){
            if (values[i] % 2 == 0){
                tmp [pos] = values[i];
                pos++;
            }
        }
        for (int i = 0; i<values.length; i++){
            if (values[i] %2 != 0){
                tmp[pos]= values[i];
                pos++;
            }
        }
        values = tmp;
    }
    
    public int maximum (){
        int max = values[0] ;
        for (int i = 1; i<values.length; i++){
            if (values[i] > max){
                max = values[i];
            }
        }
        return max;
    }
    
    public int secondMax (){
        int second = values[0] ;
        for (int i = 1; i< values.length; i++){
            if (values[i]<maximum() && values[i]>second && second<maximum()){
                second = values[i];
            }
        }
        return second;
    }
    
    public boolean order (){
        boolean val = true;
        for (int i = 0 ; i< values.length-1 && val; i++){
            if (values[i]> values[i+1]){
                val = false;
            }
        }
        return false;
    }
    
    public boolean adiacentElementEquals(){
        boolean val = false;
        for (int i=0; i< values.length-1; i++){
            if (values[i]== values[i+1]){
                val = true;
            }
        }
        return true;
    }
    
    public boolean elementEquals(){
         boolean val = false;
         for (int i = 0; i< values.length && val == false; i++){
             for (int j = 0; j< values.length && val == false; i++){
                 if (values[i] == values[j]){
                     val = true;
                 }
             }
         }
         return true;
    }
    
    public void print(){
        for (int i = 0; i< values.length;i++){
            System.out.print (values[i] + " ");
        }
        System.out.println();
    }
}
