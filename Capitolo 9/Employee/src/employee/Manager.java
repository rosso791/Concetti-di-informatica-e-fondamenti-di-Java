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
public class Manager extends Employee {
    
    private String department;
    
    public Manager(String name, Double salary, String department){
        super(name,salary);
        this.department=department;
    }
    
    public String toString (){
        return super.toString() + " department:" + this.department;
    }
}
