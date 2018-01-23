/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencevect;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class Sequence {
    private ArrayList<Integer> values;
    public Sequence(){
        values = new ArrayList<Integer>();
    }
    
    public void add(int n){
        values.add(n);
    }
    
    public String toString (){
        return values.toString();
    }
    
    public int size(){
        int counter=0;
        for (int i = 0; i<values.size();i++){
            counter++;
        }
        return counter;
    }
    
    public int get(int i){
        return values.get(i);
    }
    
    
    public Sequence append (Sequence other){
        Sequence fin = new Sequence();
        for (int i=0; i< values.size(); i++){
            fin.add(values.get(i));
        }
        for (int i = 0; i< other.size();i++){
            fin.add(other.get(i));
        }
        return fin;
    }
    
    public Sequence merge(Sequence other){
        Sequence ris = new Sequence();
        int i =0;
        while ( i< values.size() || i< other.size()){
            if (i<values.size() && i<other.size()){
                ris.add(values.get(i));
                ris.add(other.get(i));
            }
            else if (i<values.size()){
                ris.add(values.get(i));
            }
            else{
                ris.add(other.get(i));
            }
            i++;
        }
        return ris;
    }
    
    public int min (){
        int min = values.get(0);
        for (int i=1; i<values.size(); i++){
            if (values.get(i)< min){
                min = values.get(i);
            }
        }
        return min; 
    }
    
    public Sequence mergeSorted(Sequence other){
        Sequence res = new Sequence();
        int indexOther =0, valuesIndex=0;
        while (valuesIndex<values.size() && indexOther<other.size()){
             if (values.get(valuesIndex) < other.get(indexOther)){
                 res.add(values.get(valuesIndex));
                 valuesIndex++;
             }
             else{
                 res.add(other.get(indexOther));
                 indexOther++;
             }
        }
        while (valuesIndex<values.size()){
            res.add(values.get(valuesIndex));
            valuesIndex++;
        }
        while(indexOther<other.size()){
            res.add(values.get(indexOther));
            indexOther++;
        }
        return res;
    }
}
