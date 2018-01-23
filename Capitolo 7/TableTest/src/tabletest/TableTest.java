/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletest;

/**
 *
 * @author Federico
 */
public class TableTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Table test = new Table (4,4);
        test.set(0,0,16);
        test.set(0,1,3);
        test.set(0,2,2);
        test.set(0,3,13);
        test.set(1,0,5);
        test.set(1,1,10);
        test.set(1,2,11);
        test.set(1,3,8);
        test.set(2,0,9);
        test.set(2,1,6);
        test.set(2,2,7);
        test.set(2,3,12);
        test.set(3,0,4);
        test.set(3,1,15);
        test.set(3,2,14);
        test.set(3,2,1);
        System.out.println(test.neighbourAverage(1, 1));
        System.out.println(test.sum(0, true));
        System.out.println(test.sum(2, false));
    }
    
}
