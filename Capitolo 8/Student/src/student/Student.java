/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Federico
 */
public class Student {
    
    private static String name;
        
    public static String getName(){
        return name;
    }
    
    public static void setName(String aName){
        if (aName.length()>0){
            name=aName;
        }
    }
}
