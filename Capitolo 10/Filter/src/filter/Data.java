/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

/**
 *
 * @author Federico
 */
public class Data {
    
   
    public Data (Measurable m, Filter f){
       
    }
    
    public static double average (Measurable[] objects){
        double sum = 0;
        for(Measurable obj : objects){
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0){
            return sum/objects.length;
        }
        else{
            return 0;
        }
    }
    
    public static Measurable max (Measurable[] object){
        if (object.length == 0){
            return null;
        }
        Measurable max = object[0];
        for (Measurable obj : object){
            if (obj.getMeasure() > max.getMeasure()){
                max = obj;
            }
        }
        return max;
    }
    
   
    
    
}
