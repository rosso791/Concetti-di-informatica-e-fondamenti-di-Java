/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inserire il valore di r");
        Scanner input = new Scanner (System.in);
        int r = input.nextInt();
        System.out.println("Inserire il valore di h");
        int h = input.nextInt();
        System.out.println("Cube volume="+Geometry.cubeVolume(h));
        System.out.println("Cube surface="+Geometry.cubeSurface(h));
        System.out.println("Sphere volume="+Geometry.sphereVolume(r));
        System.out.println("Sphere surface="+Geometry.sphereSurface(r));
        System.out.println("Cylinder volume="+Geometry.cylinderVolume(r,h));
        System.out.println("Cylinder surface="+Geometry.cylinderSurface(r,h));
        System.out.println("Cone volume="+Geometry.coneVolume(r,h));
        System.out.println("Cone surface="+Geometry.coneSurface(r,h));
        Cube cu = new Cube (h);
        Sphere sp = new Sphere (r);
        Cylinder cy = new Cylinder (r,h);
        Cone co = new Cone (r,h);
        System.out.println("OBJECTED ORIENTED!!");
        System.out.println("Cube volume="+cu.cubeVolume());
        System.out.println("Cube surface="+cu.cubeSurface());
        System.out.println("Sphere volume="+sp.sphereVolume());
        System.out.println("Sphere surface="+sp.sphereSurface());
        System.out.println("Cylinder volume="+cy.cylinderVolume());
        System.out.println("Cylinder surface="+cy.cylinderSurface());
        System.out.println("Cone volume="+co.coneVolume());
        System.out.println("Cone surface="+co.coneSurface());
        Ellipse2D.Double ell = new Ellipse2D.Double(100, 100, 200, 300);
        System.out.println("Ellipse perimeter="+Geometry.perimeter(ell));
        System.out.println("Ellipse area="+Geometry.area(ell));
        Point2D.Double p = new Point2D.Double(1, 1);
        Point2D.Double q = new Point2D.Double(3, 0);
        System.out.println("Slope: " + Geometry.slope(p, q));
        Point2D.Double t = new Point2D.Double(3, -1);
        System.out.println("Angle: " + Geometry.angle(p, t));
        Point2D.Double o = new Point2D.Double(200, 100);
    }
    
}
