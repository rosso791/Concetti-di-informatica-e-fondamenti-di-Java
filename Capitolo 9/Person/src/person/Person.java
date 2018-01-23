/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Federico
 */
public class Person {
    
    private String name;
    private int year;
    
    public Person(String aName, int aYear){
        name = aName;
        year = aYear;
    }
    
    public String toString(){
        return "Student[name=" + name + " year=" + year +"]";
    }
}
