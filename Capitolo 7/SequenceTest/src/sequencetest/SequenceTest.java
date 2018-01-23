/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencetest;

/**
 *
 * @author Federico
 */
public class SequenceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sequence test = new Sequence (9);
        test.set(0,1);
        test.set(1,4);
        test.set(2,9);
        test.set(3,16);
        test.set(4,9);
        test.set(5,7);
        test.set(6,4);
        test.set(7,9);
        test.set(8,11);
        Sequence test2 = new Sequence (9);
        test2.set(0,11);
        test2.set(1,11);
        test2.set(2,7);
        test2.set(3,9);
        test2.set(4,16);
        test2.set(5,4);
        test2.set(6,1);
        System.out.println(test.isPermutation(test2));
        Sequence sum = test.sum(test2);
        sum.print();
    }
    
}
