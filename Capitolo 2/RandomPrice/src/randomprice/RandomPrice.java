/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomprice;
import java.util.Random;
/**
 *
 * @author Federico
 */
public class RandomPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        float a = r.nextInt(10);
        a = a+ r.nextFloat();
        
        System.out.print("Il prezzo è:");
        System.out.print(a+10.05);
    }
    
}
