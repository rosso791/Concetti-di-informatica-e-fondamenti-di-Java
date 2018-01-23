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
public class BasicAccount extends BankAccount{
    
    public BasicAccount(double balance){
        super(balance);
    }
    
    public BasicAccount(){
        super();
    }
    
    @Override
    public void withdraw(double amount){
        final int PENALTY = 30;
        if (getBalance() - amount>0){
            super.withdraw(amount);
        }
        else{
            super.withdraw(amount + PENALTY);
        }
    }
}
