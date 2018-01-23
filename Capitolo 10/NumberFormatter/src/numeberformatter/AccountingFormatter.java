/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeberformatter;

/**
 *
 * @author Federico
 */
public class AccountingFormatter implements NumberFormatter {
    
    public AccountingFormatter(){
    
    }
    
    @Override
    public String format(int n){
        if(n>0){
            return Integer.toString(n);
        }
        else{
            return "("+Integer.toString(Math.abs(n))+")";
        }
    }
    
}
