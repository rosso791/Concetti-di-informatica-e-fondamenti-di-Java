/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bignamewindow;

/**
 *
 * @author Federico
 */
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

public class BigNameComponent extends JComponent{

    private String text;
    
    BigNameComponent(String textValue) {
        setText(textValue);
    }
    
    public void setText(String textValue)
    {
        text = textValue;
    }
    
    public void paintComponent(Graphics graphics)
    {
        if(getWidth()>800)
            setText("Very long striiiiing");
        Graphics2D g = (Graphics2D) graphics;
        int size = 10;
        Font myFont = new Font("Arial",Font.BOLD,size);
        g.setFont(myFont);
        Rectangle2D bound = g.getFontMetrics().getStringBounds(text, g);
        while((bound.getWidth()<getWidth())&&(bound.getHeight()<getHeight()))
        {
            size++;
            myFont = new Font("Arial",Font.BOLD,size);
            g.setFont(myFont);
            bound = g.getFontMetrics().getStringBounds(text, g);
        }
        g.drawString(text, 0, g.getFontMetrics().getAscent());
    }
    
}
