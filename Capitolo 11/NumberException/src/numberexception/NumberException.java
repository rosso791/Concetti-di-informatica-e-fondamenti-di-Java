/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberexception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class NumberException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean quit = false;
        int sum = 0;
        int err  =0;
        while (!quit && err<=2){
            try{
               System.out.print("Enter the number or 0 to quit: ");
                int a = in.nextInt();
                if(a== 0){
                    quit= true;
                }
                sum+= a; 
            }
            catch(InputMismatchException e){
                System.out.println("Ops! Insert only number.");
                err++;
                in.nextLine();
            }   
        }
        System.out.println(sum);
    }
    
}
