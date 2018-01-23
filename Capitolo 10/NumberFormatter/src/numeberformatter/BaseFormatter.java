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
public class BaseFormatter implements NumberFormatter {
    
    public int base;
    
    public BaseFormatter (int base){
        this.base = base;
    }
    
    @Override
    public String format (int n){
        ArrayList<String> app = new ArrayList<>();
        String res = new String();
        while (n>0){
           
           app.add(Integer.toString((n%this.base)));
           n=n/this.base;
           
        }

        int i = app.size()-1;
        while(i>=0){
           res = res+ app.get(i);
           i--;
        }
        return res;
    }
    
    
}
