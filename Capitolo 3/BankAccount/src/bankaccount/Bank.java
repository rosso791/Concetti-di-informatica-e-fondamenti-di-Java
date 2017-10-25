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
public class Bank {
    private double balance;
    
    public Bank(){
        balance = 0;
    }
    
    public Bank(double initBalance){
        balance = initBalance;
    }
    
    public void deposite(double amount){
        balance = balance + amount;
    }
    
    public void withdraw (double amount){
        balance = balance - amount;
    }
    
    public double getBalance (){
        return balance;
    }
    
    public void addInterest (double rate){
        balance = balance +  (balance * rate * 0.01);
    }
    
    
}
