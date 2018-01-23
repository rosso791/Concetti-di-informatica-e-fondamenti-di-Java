/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countall;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Federico
 */
public class CountAll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner (System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner (inputFile);
        
        int countChar = 0;
        int countLine = 0;
        int countWord = 0;
        
        while (in.hasNextLine()){
            String line = in.nextLine();
            countChar+= line.length();
            countWord += new StringTokenizer(line, " ,?;:.").countTokens();
            
        }
        
        System.out.printf("This file have %d lines, %d words, %d character", countLine, countWord, countChar);
    }
    
}
