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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person a = new Person("Federico", 1991);
        Student b = new Student("Alberto", 1991, "Science");
        Instructor c = new Instructor("Alvise", 1980, 198.3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
