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
    private double balance, interstRate;
    
    public BankAccount(){
        balance = 0;
    }
    
    public BankAccount(double balance){
        this.balance=balance;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public void withdraw(double amount){
        balance -=amount;
        
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void monthEnd(){
    }
    
    
}
