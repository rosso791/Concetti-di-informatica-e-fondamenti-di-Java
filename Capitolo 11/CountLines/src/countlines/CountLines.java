/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countlines;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class CountLines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner (System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        System.out.print("Output file: ");
        String output = console.next();
        
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner (inputFile);
        PrintWriter out = new PrintWriter(output);
        
        int count = 1;
        while(in.hasNextLine()){
            String line  = in.nextLine();
            out.printf("/* %d */ %s", count, line );
            out.println();
            count++;
        }
        
        in.close();
        out.close();
    }
    
    
}
