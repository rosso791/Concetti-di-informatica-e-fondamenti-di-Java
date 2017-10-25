/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettertester;

/**
 *
 * @author Federico
 */
public class LetterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Letter myletter = new Letter ("John", "Mary");
       myletter.addLine("I am sorry we must part");
       myletter.addLine("I wish you all the best");
       System.out.print(myletter.getText());
    }
    
}
