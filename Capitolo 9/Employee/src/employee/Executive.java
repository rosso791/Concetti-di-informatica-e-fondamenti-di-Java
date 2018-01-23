/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Federico
 */
public class Executive extends Manager {
    
    public Executive (String name, double salary, String department ){
        super(name,salary,department);
    }
    
    @Override
    public String toString(){
        return "Executive " + super.toString();
    }
}
