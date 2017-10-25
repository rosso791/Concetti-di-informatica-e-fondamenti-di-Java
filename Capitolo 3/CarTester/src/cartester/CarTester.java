/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author Federico
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car myCar = new Car (50);
        myCar.addGas(20);
        myCar.drive(100);
        System.out.println(myCar.getGasInTank());
    }
    
}
