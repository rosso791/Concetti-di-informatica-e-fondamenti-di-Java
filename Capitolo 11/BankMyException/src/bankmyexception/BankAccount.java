/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmyexception;

/**
 *
 * @author Federico
 */
public class BankAccount {
    private double balance;
    
    public BankAccount(){
        balance = 0;
    }
    
    public BankAccount(double amount)throws NegativeNumber{
        if(amount<0){
            throw new NegativeNumber("Amount negative, try with a positive amount");
        }
        balance  =amount;
    }
    
    public void deposite(double amount)throws NegativeNumber{
        if (amount< 0){
            throw new NegativeNumber("Deposit amount can't be negative, only positive number");
        }
        balance+=amount;
    }
    
    public void withdraw (double amount)throws NegativeNumber{
       if(balance-amount<0 || amount<0){
           if (amount<0){
                throw new NegativeNumber("Whitdraw amount can't be negative,");
           }
           else{
               String alarm = "You can withdraw an amount < "+ balance; 
               throw new IllegalArgumentException(alarm);
           }
       }
       balance-=amount;
    }
    
    public double getBalance (){
        return balance;
    }
    
    public void addInterest (double rate){
        balance = balance +  (balance * rate * 0.01);
    }
    
}

