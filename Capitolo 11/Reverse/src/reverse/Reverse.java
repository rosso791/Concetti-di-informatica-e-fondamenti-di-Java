/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner (System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        File inputFile = new File(inputFileName);
        PrintWriter app = new PrintWriter("app.txt");
        Scanner in = new Scanner (inputFile);
        while (in.hasNext()){
            String line = in.next();
            String rev="";
            for (int j=line.length()-1; j>=0; j--){
                rev+=line.charAt(j);
                
            }
            app.println(rev);
        }
        in.close();
        app.close();
        
        inputFile = new File("app.txt");
        in = new Scanner(inputFile);
        app = new PrintWriter(inputFileName);
        while(in.hasNextLine()){
            String line = in.nextLine();
            if (!line.isEmpty()){
                app.println(line);
            }
        }
        in.close();
        app.close();
        inputFile.delete();
        
    }
    
}
