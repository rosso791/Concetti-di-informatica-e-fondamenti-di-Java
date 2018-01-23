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
public class Student extends Person {
    
    private String specialization;
    
    public Student(String aName, int aYear, String aSpec){
        super(aName,aYear);
        specialization = aSpec;    
    }
    
    
    public String toString(){
        return "Student[super=" + super.toString() + " specialization= "+ specialization + "]";
    }
   
    
}
