/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeberformatter;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class DecimalSeparatorFormatter implements NumberFormatter {
    
    public DecimalSeparatorFormatter(){
        
    }
    
    public String format(int n){
        ArrayList<String> app = new ArrayList<>();
        String res ="";
        while(n>=10){
            app.add(Integer.toString(n%10));
            if((app.size())%3 == 0 ){
                app.add(",");
            }
            n=n/10;
        } 
        app.add(Integer.toString(n%10));
        
        int i = app.size()-1;
        while(i>=0){
           res = res+ app.get(i);
           i--;
        }
        return res;
            
    }
}
