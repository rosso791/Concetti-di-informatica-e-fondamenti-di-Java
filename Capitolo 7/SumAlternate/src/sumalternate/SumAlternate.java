/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumalternate;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class SumAlternate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LENGHT = 100;
        double values[] = new double [LENGHT];
        int currentsize = 0;
        int sum = 0;
        System.out.println("Inserire valori, Q per uscire");
        Scanner in = new Scanner (System.in);
        while (in.hasNextInt() && currentsize < values.length){
            values[currentsize]= in.nextInt();
            if (currentsize%2 == 0){
                sum+= values[currentsize];
            }
            else{
                sum-=values[currentsize];
            }
            currentsize++;
        }
        System.out.println ("Somma alternata= " + sum);
    }
    
}
