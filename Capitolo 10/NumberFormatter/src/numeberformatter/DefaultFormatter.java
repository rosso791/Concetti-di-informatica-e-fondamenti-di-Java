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
public class DefaultFormatter implements NumberFormatter {
    
    public DefaultFormatter(){
        
    }
    
    public String format(int n){
        return Integer.toString(n);
    } 
}
