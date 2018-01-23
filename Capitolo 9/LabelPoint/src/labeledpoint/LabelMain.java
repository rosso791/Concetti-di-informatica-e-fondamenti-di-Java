/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labeledpoint;

/**
 *
 * @author Federico
 */
public class LabelMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LabelPoint l = new LabelPoint (1,2, "A");
        System.out.println(l.toString());
        LabelPointNew p = new LabelPointNew (2,3, "B");
        System.out.println(p.toString());
    }
    
}
