/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeric;

/**
 *
 * @author Federico
 */
public class NumericTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Numeric.intPower(0.1, 12));
        System.out.println("Expected: " + 1E-12);
        System.out.println(Numeric.intPower(2, 10));
        System.out.println("Expected: 1024");
        System.out.println(Numeric.intPower(-1, 1000));
        System.out.println("Expected: 1");
    }
    
}
