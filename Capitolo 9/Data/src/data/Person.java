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
public class Person implements Measurable {
    
    public String name;
    public double height;
    
    public Person (String name, double height){
        this.name = name;
        this.height = height;
    }
    
    public String getName(){
        return name;
    }
    
    public double getHeight(){
        return height;
    }
    
    @Override
    public double getMeasure(){
        return height;
    }
}
