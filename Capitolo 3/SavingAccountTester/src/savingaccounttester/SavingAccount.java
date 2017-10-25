/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingaccounttester;

/**
 *
 * @author Federico
 */
public class SavingAccount {
    private double balance;
    private double interst;
    
    public SavingAccount(double val, double tax){
        balance = val;
        interst = tax;
    }
    
    public void addInterst(){
        balance  = balance + (balance * interst * 0.01);
    }
    
    public double getBalance (){
        return balance;
    }
}
