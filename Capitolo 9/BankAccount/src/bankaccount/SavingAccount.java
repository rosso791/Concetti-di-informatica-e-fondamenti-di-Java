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
public class SavingAccount extends BankAccount{
    
    private double minBalance;
    private double interstRate;
    
    
    public SavingAccount(){
        interstRate = 0;
        minBalance=0;
    }
    
    public void setInterstRate (double rate){
        this.interstRate = rate;
    }
    
    public void withdraw(double amount){
        super.withdraw(amount);
        double balance = getBalance();
        if (balance<minBalance){
            minBalance = balance;
        }
    }
    
    public void monthEnd(){
        double interst = minBalance * interstRate/100;
        deposit(interst);
        minBalance = getBalance();
        
    }
}
