/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printasterisk;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class PrintAsterisk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nVal = input.nextInt();
        int [] app = new int [nVal];
        int max =0;
        for (int i = 0; i< nVal; i++){
            app[i] = input.nextInt();
            if (max < app[i]){
                max = app[i];
            }
        }
        int fat = 40-max;
        for (int i = 0; i<nVal; i++){
            for (int j = 0; j < app[i]/40; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
