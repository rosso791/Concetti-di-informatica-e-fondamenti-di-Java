/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointtester;
import java.awt.Point;
/**
 *
 * @author Federico
 */
public class PointTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point a = new Point (3,4);
        Point b = new Point (-3,-4);
        double dist = a.distance(b);
        System.out.print("Distanza = ");
        System.out.print(dist);
          
    }
    
}
