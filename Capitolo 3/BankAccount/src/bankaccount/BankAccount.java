/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author Federico
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bank conto = new Bank();
       conto.deposite(1000);
       conto.withdraw(500);
       conto.withdraw(400);
       System.out.println(conto.getBalance());
       
       Bank momSaving = new Bank(1000);
       momSaving.addInterest(10);
       System.out.println(momSaving.getBalance());
    }
    
}
