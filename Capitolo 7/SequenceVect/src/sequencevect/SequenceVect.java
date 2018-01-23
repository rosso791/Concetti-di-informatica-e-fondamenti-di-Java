/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencevect;

/**
 *
 * @author Federico
 */
public class SequenceVect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sequence n = new Sequence ();
        n.add(1);
        n.add(4);
        n.add(9);
        n.add(16);
        Sequence app = new Sequence();
        app.add(10);
        app.add(7);
        app.add(9);
        app.add(9);
        app.add(11);
        Sequence b = n.append(app);
        System.out.println(b.toString());
        b = n.merge(app);
        System.out.println(b.toString());
        b = n.mergeSorted(app);
        System.out.println(b.toString());
    }
    
}
