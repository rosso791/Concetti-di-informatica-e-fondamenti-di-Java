/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversetester;
 
/**
 *
 * @author Federico
 */
public class ReverseTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder ogg = new StringBuilder();
        ogg.append("desserts");
        ogg.reverse();
        ogg.toString();
        System.out.print(ogg);
    }
    
}
