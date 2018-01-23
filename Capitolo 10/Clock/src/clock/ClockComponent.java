/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Date;
import javax.swing.JComponent;

/**
 *
 * @author Federico
 */
public class ClockComponent extends JComponent{
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Date now = new Date();
        g2.drawString(now.toString(), 50, 100);
    }
}
