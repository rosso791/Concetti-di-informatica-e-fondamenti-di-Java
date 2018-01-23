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
public class CheckingAccount extends BankAccount {
    
    private int withdrawals;
    private int count;
    
    public CheckingAccount (){
        withdrawals = 0;
        count = 0;
        
    }
    
    @Override
    public void withdraw (double amount){
        
        final int PENAL_FIRST = 20;
        final int PENAL_SECOND = 30;
        if (getBalance()- amount >0){   
            super.withdraw(commissionWithdraw(amount));
        }
        else{
            count++;
            if (count == 1){
            super.withdraw(commissionWithdraw(amount + PENAL_FIRST));
            }
            else{
                super.withdraw(amount + PENAL_SECOND); 
            }    
        }
    }
    
    public void deposit(double amount){
        super.deposit(commissionDeposit(amount));
    }
    
    public double commissionWithdraw (double amount){
        final int FREE_WITHDRAWALS = 3;
        final int WITHDRAWAL_FEE = 1;
        withdrawals++;
        if (withdrawals >=FREE_WITHDRAWALS ){
            return amount + WITHDRAWAL_FEE;
        }
        else{
            return amount;
        }
    }
    
    public double commissionDeposit (double amount){
        final int FREE_WITHDRAWALS = 3;
        final int WITHDRAWAL_FEE = 1;
        withdrawals++;
        if (withdrawals >=FREE_WITHDRAWALS ){
            return amount - WITHDRAWAL_FEE;
        }
        else{
            return amount;
        }
    }
    
    @Override
    public void monthEnd(){
        withdrawals = 0;
    }
}
