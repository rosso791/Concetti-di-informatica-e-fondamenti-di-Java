/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bag;

/**
 *
 * @author Federico
 */
public class BagTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.add("Toothbrush");
        bag.add("Toothbrush");
        bag.add("Hair dryer");
        bag.add("Matches");
        bag.add("Bread");
        bag.add("Bread");
        bag.add("Bread");
        
        System.out.println("Bread " + bag.count("Bread"));
        System.out.println("Potato " + bag.count("Potato"));
    }
    
}
