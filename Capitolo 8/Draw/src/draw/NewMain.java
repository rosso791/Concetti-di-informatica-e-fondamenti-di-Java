/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author Federico
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame frame = new JFrame();

      final int FRAME_WIDTH = 200;
      final int FRAME_HEIGHT = 150;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("HelloViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
      frame.add(Draw.drawL(g, p));

      frame.setVisible(true);
    }
    
}
