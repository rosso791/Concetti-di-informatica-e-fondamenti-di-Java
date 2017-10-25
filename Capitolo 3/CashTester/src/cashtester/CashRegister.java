/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashtester;

/**
 *
 * @author Federico
 */
public class CashRegister {
    private double purchase;
    private double payment;
    private double total = 0;
    private String all = "";
    
    public CashRegister(){
    }
    
    public void recordPurchase(double amount){
        String app = String.valueOf(amount);
        purchase = purchase + amount;
        all = all.concat(app).concat(" "); 
        total = total + amount;
    }
    
    public void receivePayment (double amount){
        payment = payment + amount;
    }
    
    public double giveChange (){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
    
    public void printReceipt(){
        System.out.println(all);
        System.out.println(total);
    }
    
    
}
