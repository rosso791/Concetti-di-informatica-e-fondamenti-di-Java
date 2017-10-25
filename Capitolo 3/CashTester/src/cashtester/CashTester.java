/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashtester;

/**
 *
 * @author Federico
 */
public class CashTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        register.recordPurchase(29.50);
        register.recordPurchase(9.25);
        register.printReceipt();
        register.receivePayment(50);
        
    }
    
}
