/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Federico
 */
public class ClockFrame extends JFrame {
    
    private static final int FRAME_WIDTH =300;
    private static final int FRAME_HEIGHT = 400;
    private ClockComponent scene;
    
    class TimeListener implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            scene.repaint();
        }
        
   
    }
    
    public ClockFrame(){
        scene = new ClockComponent();
        add(scene);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        ActionListener listener = new TimeListener();
        final int DELAY = 1000; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}
