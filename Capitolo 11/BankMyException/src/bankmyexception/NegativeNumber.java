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
public class NegativeNumber extends IllegalArgumentException {
   
    public NegativeNumber(String s){
        super(s);
    }
}
