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
public class Instructor extends Person {
    
    private double salary;
    
    public Instructor (String aName, int aYear, double aSalary){
        super(aName, aYear);
        salary = aSalary;
    }
    
    public String toString(){
        return "Instructor[super="+ super.toString() + " salary" + salary + "]";
    }
}
