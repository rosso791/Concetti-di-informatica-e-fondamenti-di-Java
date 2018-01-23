/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterrectangle;

/**
 *
 * @author Federico
 */
public class RectangleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BetterRectangle rect = new BetterRectangle(1,1,5,8);
        System.out.println("Area = "+ rect.getArea());
        System.out.println("Perimeter = "+ rect.getPerimeter());
        BetterCostruct r = new BetterCostruct (1,1,5,8);
        System.out.println("Area = "+ r.getArea());
        System.out.println("Perimeter = "+ r.getPerimeter());
    }
    
}
