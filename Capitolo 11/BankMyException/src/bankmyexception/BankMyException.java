/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmyexception;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class BankMyException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
        BankAccount bank = new BankAccount();
        double a;
        try{
            
            
            System.out.println("Insert balance");
            a = in.nextDouble();
            bank = new BankAccount(a);
            System.out.println("How much money do you want to deposit");
            a = in.nextDouble();
            bank.deposite(a);
            System.out.println("How much money do you want to withdraw?");
            a = in.nextDouble();
            bank.withdraw(a);
        }
        catch(NegativeNumber e){
           System.out.println(e.getMessage());
           in.next();
            
        }
        System.out.println("Balance:" + bank.getBalance());
    }   
}
