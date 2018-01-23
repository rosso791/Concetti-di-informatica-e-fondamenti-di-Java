/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashwithcoin;

/**
 *
 * @author Federico
 */
public class CashRegister {
    
    private double purchase=0;
    private double payment=0;
    private double total = 0;
    
    public CashRegister() {
    }
    
    public void recordPurchase (double amount){
        purchase += amount;
    }
    
    public double getAmount (){
        return purchase;
    }
    
    public void receivePayment (int coinCount, Coin cointype){
        payment = payment + cointype.getValue()*coinCount;
    }
    
    public double getPayment(){
        return payment;
    }
    
    public double giveChange (Coin coinType){
        return payment*coinType.getValue() - purchase;  
    }
    
    public void clear(){
        payment=0;
        purchase=0;
    }

    
}
