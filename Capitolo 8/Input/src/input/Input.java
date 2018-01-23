/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Input {
    public static int readInt(Scanner in, String prompt, String error, int min, int max){
        boolean t = false;
        int num = 0;
        System.out.println(prompt);
        while (!t){
            num = in.nextInt();
            if(num>min && num<max){
                t = true;
            }
            else{
                System.out.println(error);
            }
        }
        return num;
    }
}
