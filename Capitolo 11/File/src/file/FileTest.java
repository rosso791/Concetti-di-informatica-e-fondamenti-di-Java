/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Federico
 */
public class FileTest {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        String inputFileName = "hello.txt";

        PrintWriter out = new PrintWriter(inputFileName);
        out.printf("Hello world");
        out.close();
        
        File inputFile = new File (inputFileName);
        Scanner in = new Scanner (inputFile);
        String line = in.nextLine();
        System.out.println(line);
    }
    
}
