package clockwindow;

import javax.swing.JFrame;

/**
 *
 * @author Federico
 */
public class ClockWindow {

    public static void main(String[] args) {
       JFrame window = new JFrame ("Clock");
       window.setSize(640,480);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       ClockComponent clock = new ClockComponent();
       window.add(clock);
       window.setVisible(true);
       
       while (true)
           window.repaint();
    }
    
}
