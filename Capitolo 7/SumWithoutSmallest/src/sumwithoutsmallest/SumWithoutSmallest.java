/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumwithoutsmallest;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class SumWithoutSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LENGHT = 100;
        double values[] = new double [LENGHT];
        int currentsize = 0;
        System.out.println("Inserire valori, Q per uscire");
        Scanner in = new Scanner (System.in);
        while (in.hasNextDouble() && currentsize < values.length){
            values[currentsize]= in.nextDouble();
            currentsize++;
        }
        double smaller = values[0];
        double sum= 0;
        for (int i = 1; i<currentsize;i++){
            System.out.println (sum + "   " + smaller);
            if (smaller < values[i]){
                sum+= values[i];
            }
            else{
                sum+=smaller;
                smaller = values[i];
            }
        }
        
        for (int i=0; i<currentsize; i++){
            System.out.print(values[i]+ " ");
        }
        System.out.println(sum);
        System.out.println(smaller);
        System.out.println("Differenza: " + (sum-smaller));
    }
    
}
