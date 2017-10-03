/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatester;
import java.awt.Rectangle;


/**
 *
 * @author Federico
 */
public class AreaTester {
    public static void main(String[] args) {
       Rectangle ret = new Rectangle (5,10,25,35);
       double area = ret.getWidth() * ret.getHeight();
       double perimetro = ret.getWidth()*2 + ret.getHeight()*2;
       System.out.print("Area = ");
       System.out.println(area);
       System.out.print("Perimetro = ");
       System.out.print(perimetro);
    }
    
}
