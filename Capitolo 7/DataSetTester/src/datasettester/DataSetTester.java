/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasettester;

/**
 *
 * @author Federico
 */
public class DataSetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataSet set = new DataSet (50);
        set.add(1.5);
        set.add(7.3);
        set.add(1.5);
        set.add(3.5);
        System.out.println(set.sum());
        System.out.println(set.maximum());
        System.out.println(set.minimum());
        System.out.println(set.media());
    }
    
}
