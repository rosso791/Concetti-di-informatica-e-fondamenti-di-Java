
package clockwindow;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.BasicStroke;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComponent;

/**
 *
 * @author Federico
 */
public class ClockComponent extends JComponent {
    private double radius;
    
    public ClockComponent (){
        radius = 0;
    }
    
    public void paintComponent(Graphics graphics){
        Graphics2D g = (Graphics2D) graphics;
        Calendar time = new GregorianCalendar();
        double seconds = time.get(Calendar.SECOND);
        double min = time.get(Calendar.MINUTE);
        double hour = time.get(Calendar.HOUR);
     
        radius = Math.min(getWidth()/2, getHeight()/2);
        
        Ellipse2D circle = new Ellipse2D.Double(0,0, radius*2, radius *2);
        Point2D center = new Point2D.Double(circle.getCenterX(), circle.getCenterY());
        
        g.setColor(Color.RED);//Cambio colore
        g.fill(circle);//Coloro lo sfondo
        
        g.setColor(Color.black);//Setto colore
        g.draw(circle);//Coloro le lancette
        g.setStroke(new BasicStroke (10.0f));
        g.draw(getTick(center, 0.5, hour, 12));
        g.draw(getTick(center, 0.7, min, 60));
        g.draw(getTick(center, 0.9, seconds, 60));
    }
    
    private Line2D getTick(Point2D center,  double scale,  double value, double max_value){
        
        
        double h_x = radius* scale * Math.cos(2* Math.PI* (value/max_value) - 0.5*Math.PI);
        double h_y = radius* scale * Math.sin(2* Math.PI* (value/max_value) - 0.5*Math.PI);
       
        
        /*double x2 = radius* scale2 * Math.cos(2* Math.PI* (value/max_value) - 0.5*Math.PI);
        double y2 = radius* scale2 * Math.sin(2* Math.PI* (value/max_value) - 0.5*Math.PI);*/
        return  new Line2D.Double(center, new Point2D.Double(center.getX()+h_x,center.getY()+ h_y));
        
    } 
    
}
