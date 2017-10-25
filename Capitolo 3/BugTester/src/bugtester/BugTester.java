/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtester;

/**
 *
 * @author Federico
 */
public class BugTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bug b = new Bug(10);
        b.move();
        System.out.print(b.getPosition() );
        b.turn();
        b.move();
        b.move();
        System.out.print(b.getPosition());
    }
    
}
