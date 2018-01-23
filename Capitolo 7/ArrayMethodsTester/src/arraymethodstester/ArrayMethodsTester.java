/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymethodstester;

/**
 *
 * @author Federico
 */
public class ArrayMethodsTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        ArrayMethods test =  new ArrayMethods(array);
        test.swapFirstLast();
        test.print();
        //test.shiftRight();
        //test.print();
        test.pairToZero();
        test.print();
        //test.substitute();
        //test.print();
        test.eliminate();
        test.print();
        test.firstPair();
        test.print();
        
    }
    
}
