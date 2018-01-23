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
public class InputTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Input.readInt(in, "Benvenuto", "Inserisci numero tra i limiti", 5, 10);
    }
    
}
