/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class EmptyLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String input = "file.txt";
        String fileApp = "app.txt";
        File inputFile = new File(input);
        Scanner in = new Scanner (inputFile);
        PrintWriter app = new PrintWriter(fileApp);
        
        while(in.hasNextLine()){
            String line = in.nextLine();
            if (!line.isEmpty()){
                app.println(line);
            }
        }
        in.close();
        app.close();
        
        inputFile = new File(fileApp);
        in = new Scanner(inputFile);
        app = new PrintWriter(input);
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
