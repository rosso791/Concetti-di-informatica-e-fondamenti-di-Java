/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Find {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> word = new ArrayList<>();
        Scanner console = new Scanner (System.in);
        System.out.print("Word file: ");
        String wordFileName = console.next();
        
        System.out.print("Input file: ");
        String inputFileName = console.next();
        
        File inputFile = new File(wordFileName);
        Scanner in = new Scanner (inputFile);
        
        while (in.hasNext()){
            String line = in.next();
            word.add(line); 
        }
        in.close();
        
        inputFile = new File(inputFileName);
        in = new Scanner (inputFile);
        
        while(in.hasNext()){
            String l = in.next();
            if(!word.contains(l)){
                System.out.println(l);
            }
        }
        in.close();
       
    }
    
}
