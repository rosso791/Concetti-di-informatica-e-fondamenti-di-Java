/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package columnsnumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class ColumnsNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner (System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner (inputFile);
        
        double sumCol1 = 0;
        double sumCol2 = 0;
        int count = 0;
        
        while (in.hasNextDouble()){
            
            sumCol1 += in.nextDouble();
            sumCol2 += in.nextDouble();
            count++;
        }
        
        System.out.println("Media col1 = "+ sumCol1/count);
        System.out.println("Media col2 = "+ sumCol2/count);
        
        in.close();
        
    }
    
}
