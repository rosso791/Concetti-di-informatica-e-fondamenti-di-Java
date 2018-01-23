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
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee e = new Employee ("Federico", 2153.02);
        
        Manager m = new Manager("Antonio", 3012.07, "IT");
        
        Executive ex = new Executive ("Giuseppe", 4012.30, "Logistic");
        System.out.println(e.toString());
        System.out.println(m.toString());
        System.out.println(ex.toString());
    }
    
}

