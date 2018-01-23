/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Federico
 */
public interface Measurable {
    
    double getMeasure();
    
    static Measurable largest (Measurable[] object){
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
    
    static Measurable smallest (Measurable[] object){
        if(object.length == 0){
            return null;
        }
        Measurable min = object[0];
        for (Measurable obj : object){
            if (obj.getMeasure() < min.getMeasure()){
                min = obj;
            }
        }
        return min;
    }
    
}
