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
public class Employee {
    private String name;
    private double salary;
    
    public Employee(String n, double s){
        name = n;
        salary = s;
    }
    
    public String toString (){
        return "Employee name: " + this.name + " salary:" + this.salary;  
    }
}
