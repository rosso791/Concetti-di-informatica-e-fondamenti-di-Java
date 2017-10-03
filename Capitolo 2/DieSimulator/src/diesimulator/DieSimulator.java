/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diesimulator;
import java.util.Random;
/**
 *
 * @author Federico
 */
public class DieSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(6)+1;
        System.out.print(a);
    }
    
}
